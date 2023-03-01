package at.htlleonding.yugioh.endpoints;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.PrintSet;
import at.htlleonding.yugioh.repositories.PrintSetRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/YuGiOh-DeckBuilder/PrintSet")
public class PrintSetEndpoint {
    @Inject
    PrintSetRepo printSetRepo;

    @POST
    @Path("/")
    @Consumes("application/json")
    public void addPrintSet(PrintSet printSet) {
        printSetRepo.addPrintSet(printSet);
    }

    @DELETE
    @Path("/{id}")
    public void removePrintSet(@PathParam("id") Long id) {
        printSetRepo.removePrintSet(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public PrintSet getPrintSet(@PathParam("id")Long id){
        return printSetRepo.findById(id);
    }

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    public void setCard(@PathParam("id") Long id, List<Card> card) {
        printSetRepo.setCards(id, card);
    }

    @GET
    @Path("/cards/{id}")
    @Produces("application/json")
    public List<Card> getCards(@PathParam("id") Long id) {
        return printSetRepo.getCards(id);
    }
}
