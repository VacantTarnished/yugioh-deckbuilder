package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.entities.BanList;
import at.htlleonding.yugioh.entities.BannedCard;
import at.htlleonding.yugioh.repositories.BanListRepo;
import org.jboss.resteasy.annotations.Body;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/YuGiOh-DeckBuilder/BanList")
public class BanListEndpoint {
    @Inject
    BanListRepo banListRepo;

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addBanList(BanList banList) {
        banListRepo.addBanList(banList);
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeBanList(@PathParam("id") Long id) {
        banListRepo.removeBanList(id);
    }

    @POST
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void setBannedCards(@PathParam("id") Long id, List<BannedCard> bannedCards) {
        banListRepo.setBannedCards(id, bannedCards);
    }

    @GET
    @Path("/bannedCards/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BannedCard> getBannedCards(@PathParam("id") Long id) {
        return banListRepo.getBannedCards(id);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BanList getBanList(@PathParam("id") Long id){
        return banListRepo.findById(id);
    }

}
