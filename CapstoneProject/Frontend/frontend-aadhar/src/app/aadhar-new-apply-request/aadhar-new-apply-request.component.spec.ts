import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AadharNewApplyRequestComponent } from './aadhar-new-apply-request.component';

describe('AadharNewApplyRequestComponent', () => {
  let component: AadharNewApplyRequestComponent;
  let fixture: ComponentFixture<AadharNewApplyRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AadharNewApplyRequestComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AadharNewApplyRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
