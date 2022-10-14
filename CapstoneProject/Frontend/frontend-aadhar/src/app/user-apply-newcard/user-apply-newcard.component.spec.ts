import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserApplyNewcardComponent } from './user-apply-newcard.component';

describe('UserApplyNewcardComponent', () => {
  let component: UserApplyNewcardComponent;
  let fixture: ComponentFixture<UserApplyNewcardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserApplyNewcardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserApplyNewcardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
