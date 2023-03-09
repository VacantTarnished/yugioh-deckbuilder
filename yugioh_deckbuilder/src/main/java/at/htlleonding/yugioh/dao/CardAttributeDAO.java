package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.CardAttribute;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class CardAttributeDAO {
    @Inject
    EntityManager em;

    public CardAttribute findById(Long id) {
        CardAttribute ca = em.find(CardAttribute.class, id);

        if (ca == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return ca;
    }

    @Transactional
    public CardAttribute addCardAttribute(CardAttribute cardAttribute) {
        em.persist(cardAttribute);
        return cardAttribute;
    }

    @Transactional
    public void removeCardAttribute(CardAttribute cardAttribute) {
        em.remove(cardAttribute);
    }

}
