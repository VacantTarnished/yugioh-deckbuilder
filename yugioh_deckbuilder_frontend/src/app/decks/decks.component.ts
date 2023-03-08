import { Component, OnInit } from '@angular/core';
import { DeckService, DeckRoot } from '../deck.service';

@Component({
  selector: 'app-decks',
  templateUrl: './decks.component.html',
  styleUrls: ['./decks.component.css']
})
export class DecksComponent implements OnInit {

  public decks!: DeckRoot;
  public filterText: string = "";

  constructor(public deckService: DeckService) { }

  ngOnInit(): void {
    this.loadAllDecks();
  }

  public loadAllDecks() {
    this.deckService.loadAllDecks().subscribe((data) => (this.decks = data));
  }

  public deleteDeck(id: Number) {
    this.deckService.deleteDeck(id).subscribe();
    this.ngOnInit();
  }

  public getDecks(): DeckRoot {
    return this.decks.filter((deck) => deck.name.toLocaleLowerCase().includes(this.filterText.toLowerCase()));
  }

}


