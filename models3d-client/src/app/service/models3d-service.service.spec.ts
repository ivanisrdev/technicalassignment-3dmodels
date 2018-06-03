import { TestBed, inject } from '@angular/core/testing';

import { Models3dServiceService } from './models3d-service.service';

describe('Models3dServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [Models3dServiceService]
    });
  });

  it('should be created', inject([Models3dServiceService], (service: Models3dServiceService) => {
    expect(service).toBeTruthy();
  }));
});
