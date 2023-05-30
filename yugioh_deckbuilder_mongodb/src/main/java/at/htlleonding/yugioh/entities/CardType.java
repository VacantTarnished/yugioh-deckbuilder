package at.htlleonding.yugioh.entities;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import javax.persistence.*;
import java.util.List;

@MongoEntity(collection = "cardtypes")
public class CardType extends PanacheMongoEntity {
    @Id
    @GeneratedValue(generator = "CardType_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String type;

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

}
