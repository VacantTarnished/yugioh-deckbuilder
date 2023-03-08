import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import AddDeckComponent from './add-deck/add-deck.component';
import { CardsComponent } from './cards/cards.component';
import { DecksComponent } from './decks/decks.component';
import { DetailedDeckInfoComponent } from './decks/detailed-deck-info/detailed-deck-info.component';
import { EditDeckComponent } from './decks/edit-deck/edit-deck.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/cards' },
  { path: 'decks', component: DecksComponent },
  { path: 'addDeck', component: AddDeckComponent },
  { path: 'cards', component: CardsComponent },
  {
    path: 'decks/detailed-deck-info/:id',
    component: DetailedDeckInfoComponent,
  },
  { path: 'decks/edit-deck/:id', component: EditDeckComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
