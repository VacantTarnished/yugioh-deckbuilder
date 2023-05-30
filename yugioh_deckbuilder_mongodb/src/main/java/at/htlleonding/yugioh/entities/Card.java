package at.htlleonding.yugioh.entities;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import javax.persistence.*;
import java.net.URI;
import java.util.List;

@MongoEntity(collection = "cards")
public class Card extends PanacheMongoEntity {

    @Id
    @GeneratedValue(generator = "cardID_seq", strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "printSet_card_id")
    private String cardID;
    private String rarity;
    private String langShort;
    private Boolean firstEdition;
    private String summonType;

    @Column(length = 1024)
    private String description;
    private Long atk;
    private Long def;
    private Long level;
    private String name;
    private String imageURL;
    private String icon;

    @ManyToOne(cascade = CascadeType.DETACH)
    private CardAttribute cardAttribute;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<CardType> cardType;

    @ManyToOne(cascade = CascadeType.DETACH)
    private PrintSet printSet;

    @ManyToOne(cascade = CascadeType.ALL)
    private BannedCard bannedCard;

    public Card() {
    }

    public Card(Long id, String name, String rarity, String langShort, Boolean firstEdition, String summonType, String description, Long atk, Long def, Long level, String imageURL, String icon) {
        setId(id);
        setName(name);
        setRarity(rarity);
        setLangShort(langShort);
        setFirstEdition(firstEdition);
        setSummonType(summonType);
        setDescription(description);
        setAtk(atk);
        setDef(def);
        setLevel(level);
        setImageURL(imageURL);
        setIcon(icon);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
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

    public String getSummonType() {
        return summonType;
    }

    public void setSummonType(String summonType) {
        this.summonType = summonType;
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
