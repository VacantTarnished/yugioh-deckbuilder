import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CardsService } from 'src/app/cards.service';
import { Deck, DeckRoot, DeckService } from 'src/app/deck.service';

@Component({
  selector: 'app-detailed-deck-info',
  templateUrl: './detailed-deck-info.component.html',
  styleUrls: ['./detailed-deck-info.component.css']
})
export class DetailedDeckInfoComponent implements OnInit {

  public deck!: Deck | undefined;
  public deckId: string = '0';
  public decks!: DeckRoot;

  constructor(public deckService: DeckService, public cardService: CardsService, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.deckId = this.activatedRoute.snapshot.params['id'];
    this.deckService.loadAllDecks().subscribe((data) => (this.decks = data));
    this.deck = this.decks.find((deck) => deck.id.toLocaleString() === this.deckId);
  }
}
