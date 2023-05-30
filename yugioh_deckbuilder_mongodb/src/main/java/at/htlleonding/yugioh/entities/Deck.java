package at.htlleonding.yugioh.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@MongoEntity(collection = "decks")
public class Deck extends PanacheMongoEntity {
    @Id
    @GeneratedValue(generator = "Deck_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties({"deck", "id"})
    private List<DeckCard> cards;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
