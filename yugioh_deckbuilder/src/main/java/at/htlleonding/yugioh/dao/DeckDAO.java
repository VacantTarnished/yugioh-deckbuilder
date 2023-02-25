package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.Deck;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class DeckDAO {
    @Inject
    EntityManager em;

    public Deck findById(Long id) {
        return em.find(Deck.class, id);
    }

    public Deck addDeck(Deck deck) {
        em.persist(deck);
        return deck;
    }

    public void removeDeck(Long deck) {
        em.remove(deck);
    }

    public void updateDeck(Deck deck) {
        em.merge(deck);
    }

    public void setCards(Long deckId, List<Card> cards) {
        Deck deck = findById(deckId);
        deck.setCards(cards);
        em.merge(deck);
    }

    public List<Card> getCards(Long id) {
        Deck deck = findById(id);
        return deck.getCards();
    }

    public List<Deck> getAllDecks() {
        return em.createNativeQuery("SELECT * FROM deck", Deck.class).getResultList();
    }
}
