package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.Deck;
import at.htlleonding.yugioh.repositories.DeckRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/YuGiOh-DeckBuilder/Deck")
public class DeckEndpoint {
    @Inject
    DeckRepo deckRepo;

    @POST
    @Path("/")
    @Consumes("application/json")
    public void addDeck(Deck deck) {
        deckRepo.addDeck(deck);
    }

    @DELETE
    @Path("/{id}")
    public void removeDeck(@PathParam("id") Long id) {
        deckRepo.removeDeck(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Deck getDeck(@PathParam("id") Long id) {
        return deckRepo.findById(id);
    }

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    public void setCards(@PathParam("id") Long id, List<Card> cards) {
        deckRepo.setCards(id, cards);
    }

    @GET
    @Path("/cards/{id}")
    @Produces("application/json")
    public List<Card> getCards(@PathParam("id") Long id) {
        return deckRepo.getCards(id);
    }

    @GET
    @Path("/")
    @Produces("application/json")
    public List<Deck> getAllDecks() {
        return deckRepo.getAllDecks();
    }
}
