import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PruebaComponentComponent } from './prueba-component.component';

describe('PruebaComponentComponent', () => {
  let component: PruebaComponentComponent;
  let fixture: ComponentFixture<PruebaComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PruebaComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PruebaComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should have text', () => {
    const fixture = TestBed.createComponent(PruebaComponentComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('p').textContent).toContain('prueba-component works!');
  });

});
