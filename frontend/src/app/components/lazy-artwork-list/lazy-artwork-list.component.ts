import { Component } from '@angular/core';
import {Artwork, ArtworkService} from '../../services/artwork.service';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-lazy-artwork-list',
  imports: [
    NgForOf
  ],
  templateUrl: './lazy-artwork-list.component.html',
  standalone: true,
  styleUrl: './lazy-artwork-list.component.css'
})
export class LazyArtworkListComponent {
  artworks: Artwork[] = [];

  constructor(private artworkService: ArtworkService) {}

  ngOnInit(): void {
    this.artworkService.getArtworks().subscribe({
      next: (data) => (this.artworks = data),
      error: (err) => console.error('Fout bij ophalen artworks (lazy):', err)
    });
  }

}
