package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.CardTypeDAO;
import at.htlleonding.yugioh.entities.CardType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CardTypeRepo {
    @Inject
    CardTypeDAO cardTypeDAO;

    public CardType addCardType(CardType cardType) {
        return cardTypeDAO.addCardType(cardType);
    }

    public void removeCardType(Long id) {
        cardTypeDAO.removeCardType(cardTypeDAO.findById(id));
    }

    public CardType findById(Long id) {
        return cardTypeDAO.findById(id);
    }

}
