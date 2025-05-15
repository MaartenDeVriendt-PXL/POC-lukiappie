import {Routes} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {ArtworkListComponent} from './components/artwork-list/artwork-list.component';
import {PaginatedArtworksListComponent} from './components/paginated-artworks-list/paginated-artworks-list.component';
import {LazyArtworkListComponent} from './components/lazy-artwork-list/lazy-artwork-list.component';

export const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {
    path: 'home',
    component: HomeComponent,
    children: [
      { path: '', redirectTo: 'normal', pathMatch: 'full' },
      { path: 'normal', component: ArtworkListComponent },
      { path: 'paginated', component: PaginatedArtworksListComponent },
      {
        path: 'lazy-list',
        loadComponent: () =>
          import('./components/lazy-artwork-list/lazy-artwork-list.component')
            .then(m => m.LazyArtworkListComponent)
      }
    ]
  }
];
