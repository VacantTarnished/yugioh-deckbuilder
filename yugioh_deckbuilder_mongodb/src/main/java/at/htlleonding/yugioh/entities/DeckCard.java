package at.htlleonding.yugioh.entities;

import at.htlleonding.yugioh.embeddable.DeckCardId;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import javax.persistence.*;

@MongoEntity(collection = "deckcards")
public class DeckCard extends PanacheMongoEntity {
    @EmbeddedId
    private DeckCardId id;

    @ManyToOne(cascade = CascadeType.DETACH)
    @MapsId("deckId")
    private Deck deck;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @MapsId("cardId")
    private Card card;

    private Long amount;

    public DeckCardId getId() {
        return id;
    }

    public void setId(DeckCardId id) {
        this.id = id;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
