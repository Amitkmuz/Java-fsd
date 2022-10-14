import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserAadharApplyComponent } from './user-aadhar-apply.component';

describe('UserAadharApplyComponent', () => {
  let component: UserAadharApplyComponent;
  let fixture: ComponentFixture<UserAadharApplyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserAadharApplyComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserAadharApplyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
