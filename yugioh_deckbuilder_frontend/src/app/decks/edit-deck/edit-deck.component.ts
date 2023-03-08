import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CardRoot, CardsService } from 'src/app/cards.service';
import { CardDetails, Deck, DeckRoot, DeckService } from 'src/app/deck.service';

@Component({
  selector: 'app-edit-deck',
  templateUrl: './edit-deck.component.html',
  styleUrls: ['./edit-deck.component.css'],
})
export class EditDeckComponent implements OnInit {
  constructor(
    public deckService: DeckService,
    public cardService: CardsService,
    private activatedRoute: ActivatedRoute
  ) {}

  private givenDeckId: string = '0';
  private deckId: number = 0;
  public givenDeck!: Deck;
  public decks!: DeckRoot;

  public givenCards: CardDetails[] = [];
  public cards!: CardRoot;

  ngOnInit(): void {
    this.givenDeckId = this.activatedRoute.snapshot.params['id'];
    this.deckId = parseInt(this.givenDeckId);
    this.deckService.loadAllDecks().subscribe((data) => {
      this.decks = data;
      this.givenDeck = this.getDeck();
      this.givenDeck.cards.forEach((card) => {
        this.cardService.loadCard(card.card.id).subscribe((data) => {
          this.givenCards.push({
            card: data,
            amount: card.amount,
          });
        });
      });
    });
    this.cardService.loadAllCards().subscribe((data) => {
      data.forEach((card) => {
        this.deckService.cardsToUpdate.push({
          card: card,
          amount: 0,
        });
      });
    });
    this.getAllCards();
  }

  public getDeck(): Deck {
    return this.decks.find((deck) => deck.id === this.deckId)!;
  }
  public getAllCards(): void {
    this.cardService.loadAllCards().subscribe((data) => (this.cards = data));
  }

  public updateDeck() {
    return this.deckService.updateDeck(this.deckId).subscribe();
  }

}
