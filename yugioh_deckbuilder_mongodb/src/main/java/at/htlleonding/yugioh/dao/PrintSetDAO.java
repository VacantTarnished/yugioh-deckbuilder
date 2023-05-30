package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.PrintSet;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Parameters;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class PrintSetDAO implements PanacheMongoRepository<PrintSet> {

    public PrintSet findById(Long id) {
        PrintSet printSet = findByIdOptional(new ObjectId(String.valueOf(id))).orElse(null);

        if (printSet == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return printSet;
    }

    @Transactional
    public PrintSet addPrintSet(PrintSet printSet) {
        persist(printSet);
        return printSet;
    }

    @Transactional
    public void removePrintSet(PrintSet printSet) {
        if (printSet == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        delete(printSet);
    }

    public PrintSet findByName(String name) {
        return find("name", name).firstResult();
    }
}