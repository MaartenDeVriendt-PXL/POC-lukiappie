import {Routes} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {ArtworkListComponent} from './components/artwork-list/artwork-list.component';


export const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {
    path: 'home',
    component: HomeComponent,
    children: [
      { path: '', redirectTo: 'normal', pathMatch: 'full' },
      { path: 'normal', component: ArtworkListComponent },

    ]
  }
];
