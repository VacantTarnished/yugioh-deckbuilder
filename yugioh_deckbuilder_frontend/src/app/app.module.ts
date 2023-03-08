import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSliderModule } from '@angular/material/slider';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { MatCardModule } from '@angular/material/card';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {DragDropModule} from '@angular/cdk/drag-drop';
import AddDeckComponent from './add-deck/add-deck.component';
import { DecksComponent } from './decks/decks.component';
import { CardsComponent } from './cards/cards.component';
import {MatSelectModule} from '@angular/material/select';
import { DetailedDeckInfoComponent } from './decks/detailed-deck-info/detailed-deck-info.component';
import { EditDeckComponent } from './decks/edit-deck/edit-deck.component';

@NgModule({
  declarations: [AppComponent, AddDeckComponent, DecksComponent, CardsComponent, DetailedDeckInfoComponent, EditDeckComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,

    MatCheckboxModule,
    MatButtonModule,
    MatIconModule,
    MatFormFieldModule,
    MatInputModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatCardModule,
    BrowserAnimationsModule,
    DragDropModule,
    MatSelectModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
