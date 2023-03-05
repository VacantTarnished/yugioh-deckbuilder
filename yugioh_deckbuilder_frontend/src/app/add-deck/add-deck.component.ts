import { Component, OnInit } from '@angular/core';
import { Card, CardRoot, CardsService } from '../cards.service';
import { CardDetails, Deck, DeckRoot, DeckService } from '../deck.service';

@Component({
  selector: 'app-add-deck',
  templateUrl: './add-deck.component.html',
  styleUrls: ['./add-deck.component.css'],
})
export default class AddDeckComponent implements OnInit {
  public cards: CardRoot = [];
  public deck!: Deck;
  public cardsToAdd: string[] = [];

  public filterText: String = '';

  public deckName: String = '';

  public summonTypes: String[] = [];
  public rarityTypes: String[] = [];

  constructor(
    public deckService: DeckService,
    public cardService: CardsService
  ) {}

  ngOnInit(): void {
    this.loadAllCards();
  }

  public loadAllCards() {
    this.cardService.loadAllCards().subscribe((data) => (this.cards = data));
  }

  public addCardToDeck(cardId: string) {
    this.cardsToAdd.push(cardId);
  }

  public getCards(): CardRoot {
    let result: CardRoot = this.cards;

    this.cards.forEach((card) => {
      if (card.summonType != null) {
        if (this.summonTypes.includes(card.summonType) == false) {
          this.summonTypes.push(card.summonType);
        }
      }
      if (this.rarityTypes.includes(card.rarity) == false) {
        this.rarityTypes.push(card.rarity);
      }
    });

    if (this.filterText !== '' && this.filterText !== ' ') {
      result = result.filter((card) =>
        card.name
          .toLocaleLowerCase()
          .includes(this.filterText.toLowerCase().toString())
      );
    }
    return result;
  }
}
