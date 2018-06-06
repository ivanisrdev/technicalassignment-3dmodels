import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { } from '@types/three';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { ListCardComponent } from './components/list-card/list-card.component';
import { Models3dComponent } from './components/models3d/models3d.component';
import { NavbarComponent } from './components/navbar/navbar.component';

import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatBottomSheetModule} from '@angular/material/bottom-sheet';
import {AppRoutingModule} from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListCardComponent,
    Models3dComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatBottomSheetModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
