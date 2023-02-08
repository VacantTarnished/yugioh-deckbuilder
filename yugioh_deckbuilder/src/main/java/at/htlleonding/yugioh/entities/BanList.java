package at.htlleonding.yugioh.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class BanList {
    @Id
    @Column(name = "banList_id")
    @GeneratedValue(generator = "BanList_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private Date date;

    @ManyToMany
    private List<BannedCard> bannedCards;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<BannedCard> getBannedCards() {
        return bannedCards;
    }

    public void setBannedCards(List<BannedCard> bannedCards) {
        this.bannedCards = bannedCards;
    }
}
