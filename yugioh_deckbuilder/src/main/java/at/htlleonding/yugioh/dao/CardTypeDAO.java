package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.CardType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class CardTypeDAO {
    @Inject
    EntityManager em;

    public CardType findById(Long id) {
        return em.find(CardType.class, id);
    }

    public CardType addCardType(CardType cardType) {
        em.persist(cardType);
        return cardType;
    }

    public void removeCardType(Long cardType) {
        em.remove(cardType);
    }

    public void setCards(Long cardTypeId, List<Card> cards) {
        CardType cardType = findById(cardTypeId);
        cardType.setCards(cards);
        em.merge(cardType);
    }

    public List<Card> getCards(Long cardTypeId) {
        CardType cardType = findById(cardTypeId);
        return cardType.getCards();
    }
}
