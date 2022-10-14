import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserStatusCheckComponent } from './user-status-check.component';

describe('UserStatusCheckComponent', () => {
  let component: UserStatusCheckComponent;
  let fixture: ComponentFixture<UserStatusCheckComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserStatusCheckComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserStatusCheckComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
