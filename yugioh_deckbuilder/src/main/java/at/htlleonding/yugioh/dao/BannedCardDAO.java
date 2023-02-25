package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.BanList;
import at.htlleonding.yugioh.entities.BannedCard;
import at.htlleonding.yugioh.entities.Card;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class BannedCardDAO {
    @Inject
    EntityManager em;

    public BannedCard findById(Long id) {
        return em.find(BannedCard.class, id);
    }

    public BannedCard addBannedCard(BannedCard bannedCard) {
        em.persist(bannedCard);
        return bannedCard;
    }

    public void removeBannedCard(Long bannedCard) {
        em.remove(bannedCard);
    }

    public void setBanLists(Long banCardId, List<BanList> banList) {
        BannedCard bannedCard = findById(banCardId);
        bannedCard.setBanLists(banList);
        em.merge(bannedCard);
    }

    public List<BanList> getBanLists(Long banCardId) {
        BannedCard bannedCard = findById(banCardId);
        return bannedCard.getBanLists();
    }
}
