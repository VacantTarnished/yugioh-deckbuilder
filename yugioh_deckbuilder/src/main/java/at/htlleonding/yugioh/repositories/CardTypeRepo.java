package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.CardTypeDAO;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.CardType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CardTypeRepo {
    @Inject
    CardTypeDAO cardTypeDAO;

    public void addCardType(CardType cardType) {
        cardTypeDAO.addCardType(cardType);
    }

    public void removeCardType(Long id) {
        cardTypeDAO.removeCardType(cardTypeDAO.findById(id));
    }

    public CardType findById(Long id) {
        return cardTypeDAO.findById(id);
    }

    public void setCards(Long cardTypeId, List<Card> cards) {
        cardTypeDAO.setCards(cardTypeId, cards);
    }

    public List<Card> getCards(Long cardTypeId) {
        return cardTypeDAO.getCards(cardTypeId);
    }
}
