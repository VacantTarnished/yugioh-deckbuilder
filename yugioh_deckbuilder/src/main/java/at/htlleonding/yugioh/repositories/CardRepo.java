package at.htlleonding.yugioh.repositories;

import at.htlleonding.yugioh.dao.CardDAO;
import at.htlleonding.yugioh.entities.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CardRepo {
    @Inject
    CardDAO cardDAO;

    public void addCard(Card card) {
        cardDAO.addCard(card);
    }

    public void removeCard(Long id) {
        cardDAO.removeCard(cardDAO.findById(id));
    }

    public Card findById(Long id) {
        return cardDAO.findById(id);
    }

    public void setPrintSet(Long id, PrintSet printSet) {
        cardDAO.setPrintSet(id, printSet);
    }

    public PrintSet getPrintSet(Long id) {
        return cardDAO.getPrintSet(id);
    }

    public List<Card> getAllCards() {
        return cardDAO.getAllCards();
    }

    public void setCardAttribute(Long id, CardAttribute cardAttribute) {
        cardDAO.setCardAttribute(id, cardAttribute);
    }

    public CardAttribute getCardAttribute(Long id) {
        return cardDAO.getCardAttribute(id);
    }

    public void setCardType(Long id, List<CardType> cardTypes) {
        cardDAO.setCardType(id, cardTypes);
    }

    public List<CardType> getCardType(Long id) {
        return cardDAO.getCardType(id);
    }

    public BannedCard getBannedCard(Long id) {
        return cardDAO.getBannedCard(id);
    }

    public void setBannedCard(Long id, BannedCard bannedCard) {
        cardDAO.setBannedCard(id, bannedCard);
    }
}
