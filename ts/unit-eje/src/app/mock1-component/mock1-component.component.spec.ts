import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Mock1ComponentComponent } from './mock1-component.component';

describe('Mock1ComponentComponent', () => {
  let component: Mock1ComponentComponent;
  let fixture: ComponentFixture<Mock1ComponentComponent>;
  const mock1 = jest.fn(a => a);
  const mock2 = jest.fn(a => a+a);
  const mock3 = jest.fn(a => a+a);

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Mock1ComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Mock1ComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  
  it('should call 1 times the mock', () => {
    component.funtionEjeMock(1,mock1);
    expect(mock1.mock.calls.length).toBe(1);
    expect(mock1.mock.results[0].value).toBe(1);
    console.log(mock1.mock.calls);
  });

  it('should call 2 times the mock', () => {
    component.funtionEjeMock(2,mock2);
    expect(mock2.mock.calls.length).toBe(2);
    expect(mock2.mock.calls[0][0]).toBe(2);
    expect(mock2.mock.results[1].value).toBe(4);
  });

  it('should call 0 times the mock', () => {
    component.funtionEjeMock(0,mock3);
    expect(mock3.mock.calls.length).toBe(0);
  });
});
