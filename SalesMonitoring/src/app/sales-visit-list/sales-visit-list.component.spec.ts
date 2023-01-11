import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SalesVisitListComponent } from './sales-visit-list.component';

describe('SalesVisitListComponent', () => {
  let component: SalesVisitListComponent;
  let fixture: ComponentFixture<SalesVisitListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SalesVisitListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SalesVisitListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
