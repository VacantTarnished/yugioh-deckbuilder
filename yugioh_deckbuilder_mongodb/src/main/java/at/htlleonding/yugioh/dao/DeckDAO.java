package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.embeddable.DeckCardId;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.Deck;
import at.htlleonding.yugioh.entities.DeckCard;
import at.htlleonding.yugioh.dto.DeckDTO;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Parameters;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class DeckDAO implements PanacheMongoRepository<Deck> {

    public Deck findById(Long id) {
        Deck deck = find("_id", id).firstResult();

        if (deck == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return deck;
    }

    @Transactional
    public void addDeck(DeckDTO deck) {
        if (deck.getCards() == null || deck.getCards().isEmpty()) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }

        Deck newDeck = new Deck();
        newDeck.setName(deck.getName());
        persist(newDeck);

        for (DeckCard card : deck.getCards()) {
            DeckCard newCard = new DeckCard();
            newCard.setId(new DeckCardId(newDeck.getId(), card.getCard().getId()));
            newCard.setDeck(newDeck);
            newCard.setAmount(card.getAmount());

            Card correctCard = Card.findById(card.getCard().getId());
            if (correctCard == null) {
                throw new WebApplicationException(Response.Status.NOT_FOUND);
            }
            newCard.setCard(correctCard);

            newCard.persist();
            newDeck.getCards().add(newCard);
        }

        newDeck.persist();
    }

    @Transactional
    public void removeDeck(Long id) {
        Deck deck = findById(id);

        if (deck == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        delete(deck);
    }

    public List<DeckCard> getCards(Long id) {
        Deck deck = findById(id);

        if (deck == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return deck.getCards();
    }

    public List<Deck> getAllDecks() {
        List<Deck> decks = listAll();

        if (decks == null || decks.isEmpty()) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return decks;
    }
}
