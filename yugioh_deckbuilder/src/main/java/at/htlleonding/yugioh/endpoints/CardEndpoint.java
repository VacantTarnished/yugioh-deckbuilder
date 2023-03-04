package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.entities.*;
import at.htlleonding.yugioh.repositories.CardRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/YuGiOh-DeckBuilder/Card")
public class CardEndpoint {
    @Inject
    CardRepo cardRepo;

    @POST
    @Path("/")
    @Consumes("application/json")
    public Card addCard(Card card) {
        return cardRepo.addCard(card);
    }

    @GET
    @Path("/")
    @Produces("application/json")
    public List<Card> getCards() {
        return cardRepo.getAllCards();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Card getCard(@PathParam("id") Long id) {
        return cardRepo.findById(id);
    }

    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public void deleteCard(@PathParam("id") Long id) {
        cardRepo.removeCard(id);
    }
}
