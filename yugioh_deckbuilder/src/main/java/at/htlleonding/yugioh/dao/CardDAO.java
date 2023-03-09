package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class CardDAO {
    @Inject
    EntityManager em;

    public Card findById(Long id) {
        Card card = em.find(Card.class, id);

        if (card == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return card;
    }

    @Transactional
    public Card addCard(Card card) {
        if (card == null) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }

        em.persist(card);
        return card;
    }

    @Transactional
    public void removeCard(Card card) {
        em.remove(card);
    }

    public CardAttribute getCardAttribute(Long cardId) {
        Card card = findById(cardId);
        return card.getCardAttribute();
    }

    @Transactional
    public void setCardAttribute(Long cardId, CardAttribute cardAttribute) {
        Card card = findById(cardId);
        card.setCardAttribute(cardAttribute);
        em.merge(card);
    }

    @Transactional
    public void setCardType(Long id,List<CardType> cardTypes) {
        Card card = findById(id);
        card.setCardType(cardTypes);
        em.merge(card);
    }

    public List<CardType> getCardType(Long cardId) {
        Card card = findById(cardId);
        return card.getCardType();
    }

    public List<Card> getAllCards() {
        return em.createNativeQuery("SELECT * FROM card", Card.class).getResultList();
    }

    @Transactional
    public void setPrintSet(Long id, PrintSet printSet){
        Card card = findById(id);
        card.setPrintSet(printSet);
        em.merge(card);
    }

    public PrintSet getPrintSet(Long id){
        Card card = findById(id);
        return card.getPrintSet();
    }

    public BannedCard getBannedCard(Long id){
        Card card = findById(id);
        return card.getBannedCard();
    }

    @Transactional
    public void setBannedCard(Long id, BannedCard bannedCard){
        Card card = findById(id);
        card.setBannedCard(bannedCard);
        em.merge(card);
    }
}
