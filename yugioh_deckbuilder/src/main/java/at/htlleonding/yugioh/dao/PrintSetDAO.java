package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.PrintSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PrintSetDAO {
    @Inject
    EntityManager em;

    public PrintSet findById(Long id) {
        return em.find(PrintSet.class, id);
    }

    @Transactional
    public PrintSet addPrintSet(PrintSet printSet) {
        em.persist(printSet);
        return printSet;
    }

    @Transactional
    public void removePrintSet(PrintSet printSet) {
        em.remove(printSet);
    }

}
