import { Component } from '@angular/core';
import {Artwork, ArtworkService} from '../../services/artwork.service';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-artwork-list',
  imports: [
    NgForOf
  ],
  templateUrl: './artwork-list.component.html',
  standalone: true,
  styleUrl: './artwork-list.component.css'
})
export class ArtworkListComponent {
  artworks: Artwork[] = [];

  constructor(private artworkService: ArtworkService) {}

  ngOnInit(): void {
    this.artworkService.getArtworks().subscribe(data => {
      this.artworks = data;
    });
  }
}
