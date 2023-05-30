package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.BannedCardDAO;
import at.htlleonding.yugioh.entities.BannedCard;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class BannedCardRepo {
    @Inject
    BannedCardDAO bannedCardDAO;

    public void addBannedCard(BannedCard bannedCard) {
        bannedCardDAO.addBannedCard(bannedCard);
    }

    public void removeBannedCard(Long id) {
        bannedCardDAO.removeBannedCard(bannedCardDAO.findById(id));
    }

    public BannedCard findById(Long id) {
        return bannedCardDAO.findById(id);
    }

    public List<BannedCard> getAllBannedCards() {
        return bannedCardDAO.getAllBannedCards();
    }

}
