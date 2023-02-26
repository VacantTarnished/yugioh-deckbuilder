import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddDeckComponent } from './add-deck/add-deck.component';
import { DecksComponent } from './decks/decks.component';

const routes: Routes = [
  {path:"", pathMatch:"full", redirectTo: "/decks"},
  {path:"decks", component:DecksComponent},
  {path:"addDeck", component: AddDeckComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
