import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

export interface Artwork {
  id: number;
  title: string;
  creator: string;
  description: string;
  imagePath: string;
  uploadDate: Date;
}

@Injectable({
  providedIn: 'root'
})
export class ArtworkService {

  private apiUrl = 'http://localhost:8090/artwork';

  constructor(private http: HttpClient) {}

  getArtworks(): Observable<Artwork[]> {
    return this.http.get<Artwork[]>(this.apiUrl);
  }

  getPaginatedArtworks(page: number, size: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/page`, {
      params: {
        page: page.toString(),
        size: size.toString()
      }
    });
  }
}
