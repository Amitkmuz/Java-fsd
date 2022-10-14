import { TestBed } from '@angular/core/testing';

import { UserUpdateAadharService } from './user-update-aadhar.service';

describe('UserUpdateAadharService', () => {
  let service: UserUpdateAadharService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserUpdateAadharService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
