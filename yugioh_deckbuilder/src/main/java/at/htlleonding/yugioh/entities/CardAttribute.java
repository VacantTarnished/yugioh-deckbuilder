package at.htlleonding.yugioh.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class CardAttribute {
    @Id
    @Column(name = "cardAttribute_id")
    @GeneratedValue(generator = "CardAttribute_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String attribute;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Card> cards;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
