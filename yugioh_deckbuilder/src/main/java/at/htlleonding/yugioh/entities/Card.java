package at.htlleonding.yugioh.entities;

import javax.persistence.*;
import java.net.URI;
import java.util.List;

@Entity
public class Card {

    @Id
    @Column(name = "card_id")
    @GeneratedValue(generator = "cardID_seq", strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "printSet_card_id")
    private Long cardID;
    private String rarity;
    private String langShort;
    private Boolean firstEdition;
    private String summonCost;
    private String description;
    private Long atk;
    private Long def;
    private Long level;
    private String name;
    private String imageURL;
    private String icon;

    @ManyToOne
    private CardAttribute cardAttribute;

    @ManyToMany
    private List<CardType> cardType;

    @ManyToOne
    private PrintSet printSet;

    @ManyToOne
    private BannedCard bannedCard;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCardID() {
        return cardID;
    }

    public void setCardID(Long cardID) {
        this.cardID = cardID;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getLangShort() {
        return langShort;
    }

    public void setLangShort(String langShort) {
        this.langShort = langShort;
    }

    public Boolean getFirstEdition() {
        return firstEdition;
    }

    public void setFirstEdition(Boolean firstEdition) {
        this.firstEdition = firstEdition;
    }

    public String getSummonCost() {
        return summonCost;
    }

    public void setSummonCost(String summonCost) {
        this.summonCost = summonCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAtk() {
        return atk;
    }

    public void setAtk(Long atk) {
        this.atk = atk;
    }

    public Long getDef() {
        return def;
    }

    public void setDef(Long def) {
        this.def = def;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public CardAttribute getCardAttribute() {
        return cardAttribute;
    }

    public void setCardAttribute(CardAttribute cardAttribute) {
        this.cardAttribute = cardAttribute;
    }

    public List<CardType> getCardType() {
        return cardType;
    }

    public void setCardType(List<CardType> cardType) {
        this.cardType = cardType;
    }

    public PrintSet getPrintSet() {
        return printSet;
    }

    public void setPrintSet(PrintSet printSet) {
        this.printSet = printSet;
    }

    public BannedCard getBannedCard() {
        return bannedCard;
    }

    public void setBannedCard(BannedCard bannedCard) {
        this.bannedCard = bannedCard;
    }
}
