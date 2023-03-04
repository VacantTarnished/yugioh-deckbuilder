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
        cardAttributeDAO.removeCardAttribute(cardAttributeDAO.findById(id));
    }

    public CardAttribute findById(Long id) {
        return cardAttributeDAO.findById(id);
    }

}
