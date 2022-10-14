import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAadharRetrieveComponent } from './admin-aadhar-retrieve.component';

describe('AdminAadharRetrieveComponent', () => {
  let component: AdminAadharRetrieveComponent;
  let fixture: ComponentFixture<AdminAadharRetrieveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminAadharRetrieveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminAadharRetrieveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
