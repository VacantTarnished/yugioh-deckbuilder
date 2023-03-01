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
    public void addCard(Card card) {
        cardRepo.addCard(card);
    }

    @DELETE
    @Path("/{id}")
    public void removeCard(@PathParam("id") Long id) {
        cardRepo.removeCard(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Card getCard(@PathParam("id") Long id) {
        return cardRepo.findById(id);
    }

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    public void setPrintSet(@PathParam("id") Long id, PrintSet printSet) {
        cardRepo.setPrintSet(id, printSet);
    }

    @GET
    @Path("/printSet/{id}")
    @Produces("application/json")
    public PrintSet getPrintSet(@PathParam("id") Long cardId) {
        return cardRepo.getPrintSet(cardId);
    }

    @GET
    @Path("/")
    @Produces("application/json")
    public List<Card> getCards() {
        return cardRepo.getAllCards();
    }

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    public void setCardAttribute(@PathParam("id") Long cardId, CardAttribute cardAttribute) {
        cardRepo.setCardAttribute(cardId, cardAttribute);
    }

    @GET
    @Path("/cardAttribute/{id}")
    @Produces("application/json")
    public CardAttribute getCardAttribute(@PathParam("id") Long id) {
        return cardRepo.getCardAttribute(id);
    }

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    public void setCardType(@PathParam("id") Long id, List<CardType> cardTypes) {
        cardRepo.setCardType(id, cardTypes);
    }

    @GET
    @Path("/cardType/{id}")
    @Produces("application/json")
    public List<CardType> getCardType(@PathParam("id") Long id) {
        return cardRepo.getCardType(id);
    }

    @GET
    @Path("/bannedCard/{id}")
    @Produces("application/json")
    public BannedCard getBannedCards(@PathParam("id") Long cardId) {
        return cardRepo.getBannedCard(cardId);
    }

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    public void setBannedCard(@PathParam("id") Long id, BannedCard bannedCard) {
        cardRepo.setBannedCard(id, bannedCard);
    }
}
