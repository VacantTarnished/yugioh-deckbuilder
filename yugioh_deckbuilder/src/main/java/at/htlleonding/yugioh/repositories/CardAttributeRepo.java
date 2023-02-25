package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.CardAttributeDAO;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.CardAttribute;
import com.oracle.svm.core.annotate.Inject;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class CardAttributeRepo {
    @Inject
    CardAttributeDAO cardAttributeDAO;
    public void addCardAttribute(CardAttribute cardAttribute) {
        cardAttributeDAO.addCardAttribute(cardAttribute);
    }

    public void removeCardAttribute(Long id) {
        cardAttributeDAO.removeCardAttribute(id);
    }

    public CardAttribute findById(Long id) {
        return cardAttributeDAO.findById(id);
    }

    public void setCards(Long id, List<Card> cards) {
        cardAttributeDAO.setCards(id, cards);
    }

    public List<Card> getCards(Long id) {
        return cardAttributeDAO.getCards(id);
    }
}
