package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.CardAttribute;
import at.htlleonding.yugioh.repositories.CardAttributeRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/YuGiOh-DeckBuilder/CardAttribute")
public class CardAttributeEndpoint {
    @Inject
    CardAttributeRepo cardAttributeRepo;

    @POST
    @Path("/")
    @Consumes("application/json")
    public void addCardAttribute(CardAttribute cardAttribute) {
        cardAttributeRepo.addCardAttribute(cardAttribute);
    }

    @DELETE
    @Path("/{id}")
    public void removeCardAttribute(@PathParam("id") Long id) {
        cardAttributeRepo.removeCardAttribute(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public CardAttribute getCardAttribute(@PathParam("id") Long id) {
        return cardAttributeRepo.findById(id);
    }

    @POST
    @Path("/{cardAttributeId}")
    @Consumes("application/json")
    public void setCards(@PathParam("cardAttributeId") Long cardAttributeId, List<Card> cards) {
        cardAttributeRepo.setCards(cardAttributeId, cards);
    }

    @GET
    @Path("/cards/{id}")
    @Produces("application/json")
    public List<Card> getCards(@PathParam("id") Long id) {
        return cardAttributeRepo.getCards(id);
    }
}
