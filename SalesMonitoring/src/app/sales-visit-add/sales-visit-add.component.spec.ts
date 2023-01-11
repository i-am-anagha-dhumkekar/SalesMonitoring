import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SalesVisitAddComponent } from './sales-visit-add.component';

describe('SalesVisitAddComponent', () => {
  let component: SalesVisitAddComponent;
  let fixture: ComponentFixture<SalesVisitAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SalesVisitAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SalesVisitAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
