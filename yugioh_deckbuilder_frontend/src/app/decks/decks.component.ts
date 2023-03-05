import { Component, OnInit } from '@angular/core';
import { DeckService, DeckRoot } from '../deck.service';

@Component({
  selector: 'app-decks',
  templateUrl: './decks.component.html',
  styleUrls: ['./decks.component.css']
})
export class DecksComponent implements OnInit {

  public decks!: DeckRoot;

  constructor(public deckService: DeckService) { }

  ngOnInit(): void {
    this.loadAllDecks();
  }

  public loadAllDecks() {
    this.deckService.loadAllDecks().subscribe((data) => (this.decks = data));
  }

  public deleteDeck(id: Number) {
    this.deckService.deleteDeck(id).subscribe(this.ngOnInit);
  }

}


