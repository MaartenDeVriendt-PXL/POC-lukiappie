import { Component } from '@angular/core';
import {Artwork, ArtworkService} from '../../services/artwork.service';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-lazy-image-artwork-list',
  imports: [
    NgForOf
  ],
  templateUrl: './lazy-image-artwork-list.component.html',
  standalone: true,
  styleUrl: './lazy-image-artwork-list.component.css'
})
export class LazyImageArtworkListComponent {

  artworks: Artwork[] = [];

  constructor(private artworkService: ArtworkService) {}

  ngOnInit(): void {
    this.artworkService.getArtworks().subscribe({
      next: (data) => this.artworks = data,
      error: (err) => console.error('Fout bij laden artworks:', err)
    });
  }
}
