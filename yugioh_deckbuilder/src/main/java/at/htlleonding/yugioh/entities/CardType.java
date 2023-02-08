package at.htlleonding.yugioh.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class CardType {
    @Id
    @Column(name = "cardType_id")
    @GeneratedValue(generator = "CardType_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String type;

    @ManyToMany
    private List<Card> cards;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
