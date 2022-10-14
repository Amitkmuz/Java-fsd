import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateaadharComponent } from './createaadhar.component';

describe('CreateaadharComponent', () => {
  let component: CreateaadharComponent;
  let fixture: ComponentFixture<CreateaadharComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateaadharComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateaadharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
