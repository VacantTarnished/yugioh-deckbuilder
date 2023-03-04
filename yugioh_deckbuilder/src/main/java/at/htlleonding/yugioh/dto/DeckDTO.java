package at.htlleonding.yugioh.dto;

import at.htlleonding.yugioh.entities.Card;
import at.htlleonding.yugioh.entities.DeckCard;

import java.util.List;

public class DeckDTO {
    private String name;
    private List<DeckCard> cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DeckCard> getCards() {
        return cards;
    }

    public void setCards(List<DeckCard> cards) {
        this.cards = cards;
    }
}
