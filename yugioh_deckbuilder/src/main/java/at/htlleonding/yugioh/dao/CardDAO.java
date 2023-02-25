package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class CardDAO {
    @Inject
    EntityManager em;

    public Card findById(Long id) {
        return em.find(Card.class, id);
    }

    public Card addCard(Card card) {
        em.persist(card);
        return card;
    }

    public void removeCard(Long card) {
        em.remove(card);
    }

    public Card updateCard(Card card) {
        return em.merge(card);
    }

    public CardAttribute getCardAttribute(Long cardId) {
        Card card = findById(cardId);
        return card.getCardAttribute();
    }

    public void setCardAttribute(Long cardId, CardAttribute cardAttribute) {
        Card card = findById(cardId);
        card.setCardAttribute(cardAttribute);
        em.merge(card);
    }

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

    public void setBannedCard(Long id, BannedCard bannedCard){
        Card card = findById(id);
        card.setBannedCard(bannedCard);
        em.merge(card);
    }
}
