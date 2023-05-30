package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.CardType;
import at.htlleonding.yugioh.repositories.CardTypeRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/YuGiOh-DeckBuilder/CardType")
public class CardTypeEndpoint {
    @Inject
    CardTypeRepo cardTypeRepo;

    @POST
    @Path("/")
    @Consumes("application/json")
    public CardType addCardType(CardType cardType) {
        return cardTypeRepo.addCardType(cardType);
    }

    @DELETE
    @Path("/{id}")
    public void removeCardType(@PathParam("id") Long id) {
        cardTypeRepo.removeCardType(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public void getCardType(@PathParam("id") Long id) {
        cardTypeRepo.findById(id);
    }


}
