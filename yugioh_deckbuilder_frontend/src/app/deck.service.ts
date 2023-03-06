import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Card, CardsService } from './cards.service';

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


  constructor(private http: HttpClient, private cardService: CardsService) {
    this.cardService.loadAllCards().subscribe((data) => {
      data.forEach((card) => {
        this.cardsToAdd.push({
          card: card,
          amount: 0,
        });
      });
    })
  }

  public loadAllDecks(): Observable<DeckRoot> {
    return this.http.get<DeckRoot>('http://localhost:8080/YuGiOh-DeckBuilder/Deck/')
  }

  public addNewDeck(): Observable<DeckRoot> {
    // filter cardsToAdd to only include cards with amount > 0
    this.cardsToAdd = this.cardsToAdd.filter((card) => card.amount > 0);

    const deck: Deck = {
      id: 0,
      name: this.deckName,
      cards: this.cardsToAdd
    }
    return this.http.post<DeckRoot>('http://localhost:8080/YuGiOh-DeckBuilder/Deck/', deck)
  }

  public deleteDeck(id: Number): Observable<undefined> {
    return this.http.delete<undefined>(`http://localhost:8080/YuGiOh-DeckBuilder/Deck/${id}`)
  }
}
