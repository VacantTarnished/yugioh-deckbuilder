package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.CardType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CardTypeDAO {
    @Inject
    EntityManager em;

    public CardType findById(Long id) {
        return em.find(CardType.class, id);
    }

    @Transactional
    public CardType addCardType(CardType cardType) {
        em.persist(cardType);
        return cardType;
    }

    @Transactional
    public void removeCardType(CardType cardType) {
        em.remove(cardType);
    }

}
