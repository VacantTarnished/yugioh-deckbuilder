package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.CardAttribute;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CardAttributeDAO {
    @Inject
    EntityManager em;

    public CardAttribute findById(Long id) {
        return em.find(CardAttribute.class, id);
    }

    @Transactional
    public CardAttribute addCardAttribute(CardAttribute cardAttribute) {
        em.persist(cardAttribute);
        return cardAttribute;
    }

    @Transactional
    public void removeCardAttribute(Long cardAttribute) {
        em.remove(cardAttribute);
    }

    @Transactional
    public void setCards(Long cardAttributeId, List<Card> cards) {
        CardAttribute cardAttribute = findById(cardAttributeId);
        cardAttribute.setCards(cards);
        em.merge(cardAttribute);
    }

    public List<Card> getCards(Long cardAttributeId) {
        CardAttribute cardAttribute = findById(cardAttributeId);
        return cardAttribute.getCards();
    }
}
