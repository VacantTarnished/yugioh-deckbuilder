package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.DeckDAO;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.Deck;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class DeckRepo {
    @Inject
    DeckDAO deckDAO;

    public void addDeck(Deck deck) {
        deckDAO.addDeck(deck);
    }

    public void removeDeck(Long id) {
        deckDAO.removeDeck(deckDAO.findById(id));
    }

    public Deck findById(Long id) {
        return deckDAO.findById(id);
    }

    public void setCards(Long deckId, List<Card> cards) {
        deckDAO.setCards(deckId, cards);
    }

    public List<Card> getCards(Long id) {
        return deckDAO.getCards(id);
    }

    public List<Deck> getAllDecks() {
        return deckDAO.getAllDecks();
    }
}
