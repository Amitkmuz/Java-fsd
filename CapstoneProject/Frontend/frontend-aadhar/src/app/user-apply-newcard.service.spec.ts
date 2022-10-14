import { TestBed } from '@angular/core/testing';

import { UserApplyNewcardService } from './user-apply-newcard.service';

describe('UserApplyNewcardService', () => {
  let service: UserApplyNewcardService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserApplyNewcardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
