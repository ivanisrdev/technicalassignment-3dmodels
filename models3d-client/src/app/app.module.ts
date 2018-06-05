import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { } from '@types/three';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';

import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { ListCardComponent } from './components/list-card/list-card.component';
import { Models3dComponent } from './components/models3d/models3d.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListCardComponent,
    Models3dComponent
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    MatCardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
