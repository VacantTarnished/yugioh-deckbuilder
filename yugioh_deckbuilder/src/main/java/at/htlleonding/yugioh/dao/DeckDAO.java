package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.embeddable.DeckCardId;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.Deck;
import at.htlleonding.yugioh.entities.DeckCard;
import at.htlleonding.yugioh.dto.DeckDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
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

        System.out.println(deck.getName());

        for (DeckCard card: deck.getCards()) {
            DeckCard newCard = new DeckCard();
            DeckCardId newId = new DeckCardId(newDeck.getId(), card.getCard().getId());
            newCard.setId(newId);
            newCard.setDeck(newDeck);
            newCard.setAmount(card.getAmount());

            Card correctCard = em.find(Card.class, card.getCard().getId());

            System.out.println(correctCard.getName());

            newCard.setCard(correctCard);

            newCards.add(newCard);
        }

        newDeck.setCards(newCards);

        em.persist(newDeck);
    }

    @Transactional
    public void removeDeck(Deck deck) {
        em.remove(deck);
    }

    @Transactional
    public Deck setCards(Long deckId, List<Card> cards) {
        List<DeckCard> deckCards = new LinkedList<>();
        Deck deck = findById(deckId);


        for (Card card : cards) {
            DeckCard deckCard = new DeckCard();

            deckCard.getId().setCardId(card.getId());
            deckCard.getId().setDeckId(deckId);
            deckCard.setDeck(deck);
            deckCard.setCard(card);

            em.persist(deckCard);

            deckCards.add(deckCard);
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
