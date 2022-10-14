import { TestBed } from '@angular/core/testing';

import { UserAadharApplyService } from './user-aadhar-apply.service';

describe('UserAadharApplyService', () => {
  let service: UserAadharApplyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserAadharApplyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
