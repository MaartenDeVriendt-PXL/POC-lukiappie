import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LazyArtworkListComponent } from './lazy-artwork-list.component';

describe('LazyArtworkListComponent', () => {
  let component: LazyArtworkListComponent;
  let fixture: ComponentFixture<LazyArtworkListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LazyArtworkListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LazyArtworkListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
