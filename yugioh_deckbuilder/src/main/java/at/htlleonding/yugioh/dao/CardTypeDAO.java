package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.CardType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class CardTypeDAO {
    @Inject
    EntityManager em;

    public CardType findById(Long id) {
        CardType ct = em.find(CardType.class, id);

        if (ct == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return ct;
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
