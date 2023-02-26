import { CdkDragDrop, copyArrayItem, moveItemInArray, transferArrayItem } from '@angular/cdk/drag-drop';
import { Component } from '@angular/core';

@Component({
  selector: 'app-add-deck',
  templateUrl: './add-deck.component.html',
  styleUrls: ['./add-deck.component.css']
})
export class AddDeckComponent {

  mainDeck = ['Blue-Eyes White Dragon', 'Rabidragon', 'Phantasm Spiral Dragon'];

  sideDeck = ['Chinese Chomping Cabbage'];


    cards = ['Spiral Serpent', 'Tri-Horned Dragon', 'Sengenjin', 'Your Mom', 'Wing Weaver'];

    move(event: CdkDragDrop<string[]>) {
      if (event.previousContainer === event.container) {
        moveItemInArray(event.container.data, event.previousIndex, event.currentIndex);
      } else {
          copyArrayItem(
          event.previousContainer.data,
          event.container.data,
          event.previousIndex,
          event.currentIndex,
        );
      }
    }

    remove(event: CdkDragDrop<string[]>){
      if (event.previousContainer === event.container) {
        moveItemInArray(event.container.data, event.previousIndex, event.currentIndex);
      }

      else{
          transferArrayItem(
          event.previousContainer.data,
          event.container.data,
          event.previousIndex,
          event.currentIndex,
        );
      }
    }
}
