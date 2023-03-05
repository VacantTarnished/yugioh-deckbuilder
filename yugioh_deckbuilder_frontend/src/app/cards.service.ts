import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export type CardRoot = Card[]

export interface Card {
  id: number
  cardID: string
  rarity: string
  langShort: string
  firstEdition: boolean
  summonType?: string
  description: string
  atk?: number
  def?: number
  level?: number
  name: string
  imageURL: string
  icon?: string
  cardAttribute: CardAttribute
  cardType: CardType[]
  printSet: PrintSet
  bannedCard?: BannedCard
}

export interface CardAttribute {
  id: number
  attribute: string
}

export interface CardType {
  id: number
  type: string
}

export interface PrintSet {
  id: number
  shortName: string
  longName: string
}

export interface BannedCard {
  id: number
  name: string
  allowedAmount: number
}

@Injectable({
  providedIn: 'root'
})
export class CardsService {

  constructor(private http: HttpClient) { }

  public loadAllCards(): Observable<CardRoot> {
    return this.http.get<CardRoot>('http://localhost:8080/YuGiOh-DeckBuilder/Card/')
  }

}
