import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserUpdateAadharComponent } from './user-update-aadhar.component';

describe('UserUpdateAadharComponent', () => {
  let component: UserUpdateAadharComponent;
  let fixture: ComponentFixture<UserUpdateAadharComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserUpdateAadharComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserUpdateAadharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
