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

  public addNewDeck() {
    this.deckService.addNewDeck().subscribe();
  }

  public addCardToDeck(card: Card) {
    if (
      this.deckService.cardsToAdd.find(
        (cardDetails) => cardDetails.card.id === card.id
      )
    ) {
      this.deckService.cardsToAdd = this.deckService.cardsToAdd.map(
        (cardDetails) => {
          if (cardDetails.card.id === card.id) {
            if (cardDetails.amount === 3) {
              return cardDetails;
            }
            cardDetails.amount++;
          }
          return cardDetails;
        }
      );
      return;
    }
    this.deckService.cardsToAdd.push({
      card: card,
      amount: 1,
    });
  }

  public removeCardFromDeck(card: Card) {
    this.deckService.cardsToAdd = this.deckService.cardsToAdd.map(
      (cardDetails) => {
        if (cardDetails.card.id === card.id) {
          cardDetails.amount--;
        }
        return cardDetails;
      }
    );
    this.deckService.cardsToAdd = this.deckService.cardsToAdd.filter(
      (cardDetails) => cardDetails.amount > 0
    );
  }
}
