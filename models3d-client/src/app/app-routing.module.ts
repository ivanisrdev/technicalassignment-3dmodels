import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {ListCardComponent} from './components/list-card/list-card.component';
import {Models3dComponent} from './components/models3d/models3d.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'list-card', component: ListCardComponent },
  { path: 'models3d', component: Models3dComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
