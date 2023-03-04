package at.htlleonding.yugioh.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class CardAttribute {
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
