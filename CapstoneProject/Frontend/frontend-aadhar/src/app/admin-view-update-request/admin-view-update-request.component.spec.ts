import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminViewUpdateRequestComponent } from './admin-view-update-request.component';

describe('AdminViewUpdateRequestComponent', () => {
  let component: AdminViewUpdateRequestComponent;
  let fixture: ComponentFixture<AdminViewUpdateRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminViewUpdateRequestComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminViewUpdateRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
