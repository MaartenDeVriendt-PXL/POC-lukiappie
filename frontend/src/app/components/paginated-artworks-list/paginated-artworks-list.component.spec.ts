import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaginatedArtworksListComponent } from './paginated-artworks-list.component';

describe('PaginatedArtworksListComponent', () => {
  let component: PaginatedArtworksListComponent;
  let fixture: ComponentFixture<PaginatedArtworksListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PaginatedArtworksListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PaginatedArtworksListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
