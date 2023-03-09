package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.embeddable.DeckCardId;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.Deck;
import at.htlleonding.yugioh.entities.DeckCard;
import at.htlleonding.yugioh.dto.DeckDTO;
import org.hibernate.annotations.Cascade;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.transaction.Transaction;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class DeckDAO {
    @Inject
    EntityManager em;

    public Deck findById(Long id) {
        Deck deck = em.find(Deck.class, id);

        if (deck == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return deck;
    }

    @Transactional
    public void addDeck(DeckDTO deck) {
        if (deck.getCards() == null || deck.getCards().size() == 0) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }


        Deck newDeck = new Deck();
        List<DeckCard> newCards = new LinkedList<>();
        newDeck.setName(deck.getName());

        em.persist(newDeck);

        System.out.println(deck.getName());
        System.out.printf("%d DeckID%n", newDeck.getId());

        for (DeckCard card: deck.getCards()) {
            DeckCard newCard = new DeckCard();
            DeckCardId newId = new DeckCardId(newDeck.getId(), card.getCard().getId());
            newCard.setId(newId);
            newCard.setDeck(newDeck);
            newCard.setAmount(card.getAmount());

            Card correctCard = em.find(Card.class, card.getCard().getId());

            System.out.println(correctCard.getName());

            newCard.setCard(correctCard);

            em.persist(newCard);

            newCards.add(newCard);
        }

        newDeck.setCards(newCards);

        em.persist(newDeck);
    }

    @Transactional
    public void removeDeck(Long id) {
        Deck deck = em.find(Deck.class, id);

        if (deck == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        em.remove(deck);
    }

    public List<DeckCard> getCards(Long id) {
        Deck deck = findById(id);

        if (deck == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return deck.getCards();
    }

    public List<Deck> getAllDecks() {
        List<Deck> decks = em.createNativeQuery("SELECT * FROM deck", Deck.class).getResultList();

        if (decks == null || decks.size() == 0) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return decks;
    }
}
