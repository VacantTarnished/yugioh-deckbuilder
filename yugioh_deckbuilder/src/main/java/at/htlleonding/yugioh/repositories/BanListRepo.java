package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.BanListDAO;
import at.htlleonding.yugioh.entities.BanList;
import at.htlleonding.yugioh.entities.BannedCard;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class BanListRepo {
    @Inject
    BanListDAO banListDAO;

    public void addBanList(BanList banList) {
        banListDAO.addBanList(banList);
    }

    public void removeBanList(Long id) {
        banListDAO.removeBanList(id);
    }

    public BanList findById(Long id) {
        return banListDAO.findById(id);
    }

    public void setBannedCards(Long id, List<BannedCard> bannedCards) {
        banListDAO.setBannedCards(id, bannedCards);
    }

    public List<BannedCard> getBannedCards(Long id) {
        return banListDAO.getBannedCards(id);
    }
}
