package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.BannedCard;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class BannedCardDAO {
    @Inject
    EntityManager em;

    public BannedCard findById(Long id) {
        return em.find(BannedCard.class, id);
    }

    @Transactional
    public BannedCard addBannedCard(BannedCard bannedCard) {
        em.persist(bannedCard);
        return bannedCard;
    }

    @Transactional
    public void removeBannedCard(BannedCard bannedCard) {
        em.remove(bannedCard);
    }

    public List<BannedCard> getAllBannedCards() {
        return em.createNativeQuery("select * from bannedCard", BannedCard.class).getResultList();
    }
}
