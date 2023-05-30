package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.BannedCard;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class BannedCardDAO implements PanacheMongoRepository<BannedCard> {

    public BannedCard findById(Long id) {
        BannedCard bc = find("_id", id).firstResult();

        if (bc == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return bc;
    }

    @Transactional
    public BannedCard addBannedCard(BannedCard bannedCard) {
        if (bannedCard == null) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }

        persist(bannedCard);
        return bannedCard;
    }

    @Transactional
    public void removeBannedCard(BannedCard bannedCard) {
        if (bannedCard == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        delete(bannedCard);
    }

    public List<BannedCard> getAllBannedCards() {
        return listAll();
    }
}
