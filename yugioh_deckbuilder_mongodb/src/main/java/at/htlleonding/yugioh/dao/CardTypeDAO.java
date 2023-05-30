package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.CardType;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class CardTypeDAO implements PanacheMongoRepository<CardType> {

    public CardType findById(Long id) {
        CardType ct = findByIdOptional(new ObjectId(String.valueOf(id))).orElse(null);

        if (ct == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return ct;
    }

    @Transactional
    public CardType addCardType(CardType cardType) {
        if (cardType == null) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }

        persist(cardType);
        return cardType;
    }

    @Transactional
    public void removeCardType(CardType cardType) {
        if (cardType == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        delete(cardType);
    }

}
