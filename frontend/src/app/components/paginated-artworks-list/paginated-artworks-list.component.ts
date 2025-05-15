import { Component } from '@angular/core';
import {Artwork, ArtworkService} from '../../services/artwork.service';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-paginated-artworks-list',
  templateUrl: './paginated-artworks-list.component.html',
  standalone: true,
  imports: [
    NgForOf
  ],
  styleUrl: './paginated-artworks-list.component.css'
})
export class PaginatedArtworksListComponent {
  artworks: Artwork[] = [];
  currentPage = 0;
  pageSize = 10;
  totalPages = 0;

  constructor(private artworkService: ArtworkService) {}

  ngOnInit(): void {
    this.loadArtworks();
  }

  loadArtworks(): void {
    this.artworkService.getPaginatedArtworks(this.currentPage, this.pageSize).subscribe({
      next: response => {
        this.artworks = response.content;
        this.totalPages = response.totalPages;
      },
      error: err => console.error('Fout bij laden van paginatie:', err)
    });
  }

  nextPage(): void {
    if (this.currentPage + 1 < this.totalPages) {
      this.currentPage++;
      this.loadArtworks();
    }
  }

  prevPage(): void {
    if (this.currentPage > 0) {
      this.currentPage--;
      this.loadArtworks();
    }
  }
}
