import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Card } from './cards.service';

export type DeckRoot = Deck[]

export interface Deck {
  id: number
  name: string
  cards: CardDetails[]
}

export interface CardDetails {
  card: Card
  amount: number
}

@Injectable({
  providedIn: 'root'
})
export class DeckService {

  public cardsToAdd: CardDetails[] = [];
  public deckName: string = '';


  constructor(private http: HttpClient) { }

  public loadAllDecks(): Observable<DeckRoot> {
    return this.http.get<DeckRoot>('http://localhost:8080/YuGiOh-DeckBuilder/Deck/')
  }

  public addNewDeck(): Observable<DeckRoot> {
    const deck: Deck = {
      id: 0,
      name: this.deckName,
      cards: this.cardsToAdd
    }
    return this.http.post<DeckRoot>('http://localhost:8080/YuGiOh-DeckBuilder/Deck/', deck)
  }
}
