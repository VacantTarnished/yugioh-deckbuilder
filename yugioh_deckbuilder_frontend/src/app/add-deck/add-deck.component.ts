import { Component, OnInit } from '@angular/core';
import { CardRoot, CardsService } from '../cards.service';
import { Deck, DeckService } from '../deck.service';

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

}
