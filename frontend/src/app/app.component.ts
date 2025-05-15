import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {ArtworkListComponent} from './components/artwork-list/artwork-list.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ArtworkListComponent],
  templateUrl: './app.component.html',
  standalone: true,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend';
}
