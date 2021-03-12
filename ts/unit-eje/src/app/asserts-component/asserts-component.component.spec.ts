import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssertsComponentComponent } from './asserts-component.component';

describe('AssertsComponentComponent', () => {
  let component: AssertsComponentComponent;
  let fixture: ComponentFixture<AssertsComponentComponent>;
  
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AssertsComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AssertsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should be 4', () => {
    expect(component.sumaTest(2,2)).toBe(4);
  });

  it('should be number, but it be str', () => {
    expect(component.sumaTestMal(2,2)).toBeInstanceOf(Number);
  });

});
