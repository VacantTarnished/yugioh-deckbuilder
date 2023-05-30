package at.htlleonding.yugioh.entities;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import javax.persistence.*;
import java.util.List;

@MongoEntity(collection = "cardattributes")
public class CardAttribute extends PanacheMongoEntity {
    @Id
    @GeneratedValue(generator = "CardAttribute_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String attribute;

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
}
