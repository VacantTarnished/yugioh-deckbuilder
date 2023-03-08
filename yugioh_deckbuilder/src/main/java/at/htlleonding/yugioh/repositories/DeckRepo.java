package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.DeckDAO;
import at.htlleonding.yugioh.dto.DeckDTO;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.Deck;
import at.htlleonding.yugioh.entities.DeckCard;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Set;

@ApplicationScoped
public class DeckRepo {
    @Inject
    DeckDAO deckDAO;

    public void addDeck(DeckDTO deck) {
        deckDAO.addDeck(deck);
    }

    public void removeDeck(Long id) {
        deckDAO.removeDeck(id);
    }

    public Deck findById(Long id) {
        return deckDAO.findById(id);
    }

    public List<DeckCard> getCards(Long id) {
        return deckDAO.getCards(id);
    }

    public List<Deck> getAllDecks() {
        return deckDAO.getAllDecks();
    }
}
