import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CardsService } from 'src/app/cards.service';
import { CardDetails, Deck, DeckRoot, DeckService } from 'src/app/deck.service';

@Component({
  selector: 'app-detailed-deck-info',
  templateUrl: './detailed-deck-info.component.html',
  styleUrls: ['./detailed-deck-info.component.css'],
})
export class DetailedDeckInfoComponent implements OnInit {
  public deck!: Deck;
  public givenDeckId: string = '0';
  public deckId: number = 0;
  public decks!: DeckRoot;

  public cards: CardDetails[] = [];

  constructor(
    public deckService: DeckService,
    public cardService: CardsService,
    private activatedRoute: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.givenDeckId = this.activatedRoute.snapshot.params['id'];
    this.deckId = parseInt(this.givenDeckId);
    this.deckService.loadAllDecks().subscribe((data) => {
      this.decks = data;
      this.deck = this.getDeck();
      this.deck.cards.forEach((card) => {
        this.cardService.loadCard(card.card.id).subscribe((data) => {
          this.cards.push({
            card: data,
            amount: card.amount,
          });
        });
      });
    });
  }

  public getDeck(): Deck {
    return this.decks.find((deck) => deck.id === this.deckId)!;
  }
}
