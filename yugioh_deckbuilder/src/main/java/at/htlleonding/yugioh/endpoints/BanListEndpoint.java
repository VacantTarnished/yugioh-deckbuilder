package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.entities.BanList;
import at.htlleonding.yugioh.repositories.BanListRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/YuGiOh-DeckBuilder/BanList")
public class BanListEndpoint {
    @Inject
    BanListRepo banListRepo;

    @POST
    @Path("/addBanList")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addBanList(BanList banList) {
        banListRepo.addBanList(banList);
    }

    @DELETE
    @Path("/removeBanList/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeBanList(@PathParam("id") Long id) {
        banListRepo.removeBanList(id);
    }

    /*
    @PATCH
    @Path("/addBanListCard/{banId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public BanList addBanListCard(@PathParam("banId") Long banId) {
        BanList b = banListRepo.addBanList(banId);
        return b;
    }
     */

}
