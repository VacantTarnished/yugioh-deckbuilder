package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.dto.DeckDTO;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.Deck;
import at.htlleonding.yugioh.entities.DeckCard;
import at.htlleonding.yugioh.repositories.DeckRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;
import java.util.Set;

@Path("/YuGiOh-DeckBuilder/Deck")
public class DeckEndpoint {
    @Inject
    DeckRepo deckRepo;

    @POST
    @Path("/")
    @Produces("application/json")
    @Consumes("application/json")
    public void addDeck(DeckDTO deck) {
        deckRepo.addDeck(deck);
    }

    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public void removeDeck(@PathParam("id") Long id) {
        deckRepo.removeDeck(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Deck getDeck(@PathParam("id") Long id) {
        return deckRepo.findById(id);
    }

    @PATCH
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Deck setCards(@PathParam("id") Long id, List<DeckCard> cards) {
        return deckRepo.setCards(id, cards);
    }

    @GET
    @Path("/")
    @Produces("application/json")
    public List<Deck> getAllDecks() {
        return deckRepo.getAllDecks();
    }
}
