package at.htlleonding.yugioh.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class PrintSet {
    @Id
    @GeneratedValue(generator = "print_set_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String shortName;
    private String longName;

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

}
