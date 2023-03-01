package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.entities.BanList;
import at.htlleonding.yugioh.entities.BannedCard;
import at.htlleonding.yugioh.repositories.BannedCardRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/YuGiOh-DeckBuilder/BannedCard")
public class BannedCardEndpoint {
    @Inject
    BannedCardRepo bannedCardRepo;

    @POST
    @Path("/")
    @Consumes("application/json")
    public void addBannedCard(BannedCard bannedCard) {
        bannedCardRepo.addBannedCard(bannedCard);
    }

    @DELETE
    @Path("/{id}")
    public void removeBannedCard(@PathParam("id") Long id) {
        bannedCardRepo.removeBannedCard(id);
    }

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    public void setBanLists(@PathParam("id") Long id, List<BanList> banList) {
        bannedCardRepo.setBanLists(id, banList);
    }

    @GET
    @Path("/banList/{id}")
    @Produces("application/json")
    public List<BanList> getBanLists(@PathParam("id") Long id) {
        return bannedCardRepo.getBanLists(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public BannedCard getBannedCard(@PathParam("id") Long id) {
        return bannedCardRepo.findById(id);
    }
}
