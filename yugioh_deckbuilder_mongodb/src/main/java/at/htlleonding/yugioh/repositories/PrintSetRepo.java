package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.PrintSetDAO;
import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.PrintSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PrintSetRepo {
    @Inject
    PrintSetDAO printSetDAO;

    public PrintSet addPrintSet(PrintSet printSet) {
        return printSetDAO.addPrintSet(printSet);
    }

    public void removePrintSet(Long id) {
        printSetDAO.removePrintSet(printSetDAO.findById(id));
    }

    public PrintSet findById(Long id) {
        return printSetDAO.findById(id);
    }

}
