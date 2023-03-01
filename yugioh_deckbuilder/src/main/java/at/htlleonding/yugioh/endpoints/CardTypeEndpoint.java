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
    public void addCardType(CardType cardType) {
        cardTypeRepo.addCardType(cardType);
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

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    public void setCards(@PathParam("id") Long id, List<Card> cards) {
        cardTypeRepo.setCards(id, cards);
    }

    @GET
    @Path("/cards/{id}")
    @Produces("application/json")
    public List<Card> getCards(@PathParam("id") Long id) {
        return cardTypeRepo.getCards(id);
    }
}
