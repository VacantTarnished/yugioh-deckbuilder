package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.BanList;
import at.htlleonding.yugioh.entities.BannedCard;
import at.htlleonding.yugioh.entities.Card;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class BanListDAO {
    @Inject
    EntityManager em;

    public BanList findById(Long id) {
        return em.find(BanList.class, id);
    }

    public BanList addBanList(BanList banList) {
        em.persist(banList);
        return banList;
    }

    public void removeBanList(Long id) {
        em.remove(id);
    }

    public List<BannedCard> getBannedCards(Long banListId) {
        BanList banList = findById(banListId);
        return banList.getBannedCards();
    }

    public void setBannedCards (Long id, List<BannedCard> bannedCards) {
        BanList banList = findById(id);
        banList.setBannedCards(bannedCards);
        em.merge(banList);
    }
}
