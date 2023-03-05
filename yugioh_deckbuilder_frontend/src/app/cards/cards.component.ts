import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Card, CardsService, CardRoot } from '../cards.service';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.css'],
})
export class CardsComponent implements OnInit {
  public cards: CardRoot = [];
  public filterText: String = '';
  public filterSummonType: String = '';
  public filterRarity: String = '';

  public summonTypes: String[] = [];
  public rarityTypes: String[] = [];

  constructor(public cardService: CardsService) {}

  ngOnInit(): void {
    this.loadAllCards();
  }

  public loadAllCards() {
    this.cardService.loadAllCards().subscribe((data) => (this.cards = data));
  }

  public getCards(): CardRoot {
    let result: CardRoot = this.cards;

    this.cards.forEach((card) => {
      if (card.summonType != null) {
        if (this.summonTypes.includes(card.summonType) == false) {
          this.summonTypes.push(card.summonType);
        }
      }
      if(this.rarityTypes.includes(card.rarity) == false){
        this.rarityTypes.push(card.rarity);
      }
    });

    if (this.filterText !== '' && this.filterText !== ' ') {
      result = result.filter((card) =>
        card.name
          .toLocaleLowerCase()
          .includes(this.filterText.toLowerCase().toString())
      );
    }

    if(this.filterSummonType !== '' && this.filterSummonType !== ' '){
      result = result.filter((card) =>
      card.summonType?.includes(this.filterSummonType.toString()))
    }

    if(this.filterRarity !== '' && this.filterRarity !== ' '){
      result = result.filter((card) =>
      card.rarity?.includes(this.filterRarity.toString()))
    }
    return result;

  }

  public resetFilters(){
    this.filterText = '';
    this.filterSummonType = '';
    this.filterRarity = '';
  }
}
