package at.htlleonding.yugioh.dao;

import at.htlleonding.yugioh.entities.*;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class CardDAO implements PanacheMongoRepository<Card> {

    public Card findById(Long id) {
        Card card = find("_id", id).firstResult();

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

        persist(card);
        return card;
    }

    @Transactional
    public void removeCard(Card card) {
        if (card == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        delete(card);
    }

    public CardAttribute getCardAttribute(Long cardId) {
        Card card = findById(cardId);
        return card.getCardAttribute();
    }

    @Transactional
    public void setCardAttribute(Long cardId, CardAttribute cardAttribute) {
        Card card = findById(cardId);
        card.setCardAttribute(cardAttribute);
        persist(card);
    }

    @Transactional
    public void setCardType(Long id, List<CardType> cardTypes) {
        Card card = findById(id);
        card.setCardType(cardTypes);
        persist(card);
    }

    public List<CardType> getCardType(Long cardId) {
        Card card = findById(cardId);
        return card.getCardType();
    }

    public List<Card> getAllCards() {
        return listAll();
    }

    @Transactional
    public void setPrintSet(Long id, PrintSet printSet) {
        Card card = findById(id);
        card.setPrintSet(printSet);
        persist(card);
    }

    public PrintSet getPrintSet(Long id) {
        Card card = findById(id);
        return card.getPrintSet();
    }

    public BannedCard getBannedCard(Long id) {
        Card card = findById(id);
        return card.getBannedCard();
    }

    @Transactional
    public void setBannedCard(Long id, BannedCard bannedCard) {
        Card card = findById(id);
        card.setBannedCard(bannedCard);
        persist(card);
    }
}
