package at.htlleonding.yugioh.entities;

import javax.persistence.*;

@Entity
public class BannedCard {
    @Id
    @Column(name = "bannedCard_id")
    @GeneratedValue(generator = "BannedCard_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Long allowedAmount;

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

    public Long getAllowedAmount() {
        return allowedAmount;
    }

    public void setAllowedAmount(Long allowedAmount) {
        this.allowedAmount = allowedAmount;
    }
}
