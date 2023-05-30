package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.CardAttribute;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class CardAttributeDAO implements PanacheMongoRepository<CardAttribute> {

    public CardAttribute findById(Long id) {
        CardAttribute ca = findByIdOptional(new ObjectId(String.valueOf(id))).orElse(null);

        if (ca == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return ca;
    }

    @Transactional
    public CardAttribute addCardAttribute(CardAttribute cardAttribute) {
        if (cardAttribute == null) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }

        persist(cardAttribute);
        return cardAttribute;
    }

    @Transactional
    public void removeCardAttribute(CardAttribute cardAttribute) {
        if (cardAttribute == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        delete(cardAttribute);
    }

}
