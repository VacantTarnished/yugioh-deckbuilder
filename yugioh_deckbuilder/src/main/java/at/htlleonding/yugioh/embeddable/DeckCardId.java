package at.htlleonding.yugioh.embeddable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DeckCardId implements Serializable {
    private Long deckId;
    private Long cardId;

    public DeckCardId() {

    }

    public DeckCardId(Long deckId, Long cardId) {
        this.deckId = deckId;
        this.cardId = cardId;
    }

    public Long getDeckId() {
        return deckId;
    }

    public void setDeckId(Long deckId) {
        this.deckId = deckId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeckCardId deckCard = (DeckCardId) o;
        return Objects.equals(deckId, deckCard.deckId) && Objects.equals(cardId, deckCard.cardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deckId, cardId);
    }
}
