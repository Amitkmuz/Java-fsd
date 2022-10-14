import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminViewNewcardRequestComponent } from './admin-view-newcard-request.component';

describe('AdminViewNewcardRequestComponent', () => {
  let component: AdminViewNewcardRequestComponent;
  let fixture: ComponentFixture<AdminViewNewcardRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminViewNewcardRequestComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminViewNewcardRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
