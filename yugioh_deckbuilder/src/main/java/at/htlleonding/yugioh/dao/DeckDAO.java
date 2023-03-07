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
import java.util.LinkedList;
import java.util.List;

@ApplicationScoped
public class DeckDAO {
    @Inject
    EntityManager em;

    public Deck findById(Long id) {
        return em.find(Deck.class, id);
    }

    @Transactional
    public void addDeck(DeckDTO deck) {
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

        em.remove(deck);
    }

    @Transactional
    public Deck setCards(Long deckId, List<DeckCard> cards) {
        List<DeckCard> deckCards = new LinkedList<>();
        Deck deck = findById(deckId);

        for (DeckCard card: cards) {
            DeckCard newCard = new DeckCard();
            DeckCardId newId = new DeckCardId(deckId, card.getCard().getId());
            newCard.setId(newId);
            newCard.setDeck(deck);
            newCard.setAmount(card.getAmount());

            Card correctCard = em.find(Card.class, card.getCard().getId());

            newCard.setCard(correctCard);

            em.persist(newCard);

            deckCards.add(newCard);
        }

        deck.setCards(deckCards);
        return em.merge(deck);
    }

    public List<DeckCard> getCards(Long id) {
        Deck deck = findById(id);
        return deck.getCards();
    }

    public List<Deck> getAllDecks() {
        return em.createNativeQuery("SELECT * FROM deck", Deck.class).getResultList();
    }
}
