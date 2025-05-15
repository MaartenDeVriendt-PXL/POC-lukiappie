import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LazyImageArtworkListComponent } from './lazy-image-artwork-list.component';

describe('LazyImageArtworkListComponent', () => {
  let component: LazyImageArtworkListComponent;
  let fixture: ComponentFixture<LazyImageArtworkListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LazyImageArtworkListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LazyImageArtworkListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
