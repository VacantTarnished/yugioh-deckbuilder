package at.htlleonding.yugioh.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class PrintSet {
    @Id
    @Column(name = "printSet_id")
    @GeneratedValue(generator = "print_set_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String shortName;
    private String longName;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Card> cards;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
