package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.PrintSet;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class PrintSetDAO {
    @Inject
    EntityManager em;

    public PrintSet findById(Long id) {
        PrintSet ps = em.find(PrintSet.class, id);

        if (ps == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return ps;
    }

    @Transactional
    public PrintSet addPrintSet(PrintSet printSet) {
        em.persist(printSet);
        return printSet;
    }

    @Transactional
    public void removePrintSet(PrintSet printSet) {
        if (printSet == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        em.remove(printSet);
    }

}
