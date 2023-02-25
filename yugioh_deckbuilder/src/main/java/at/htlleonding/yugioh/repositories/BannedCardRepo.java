package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.BannedCardDAO;
import at.htlleonding.yugioh.entities.BanList;
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
        bannedCardDAO.removeBannedCard(id);
    }

    public BannedCard findById(Long id) {
        return bannedCardDAO.findById(id);
    }

    public void setBanLists(Long banCardId, List<BanList> banList) {
        bannedCardDAO.setBanLists(banCardId, banList);
    }

    public List<BanList> getBanLists(Long banCardId) {
        return bannedCardDAO.getBanLists(banCardId);
    }
}
