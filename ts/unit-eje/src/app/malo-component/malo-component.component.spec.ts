import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MaloComponentComponent } from './malo-component.component';

describe('MaloComponentComponent', () => {
  let component: MaloComponentComponent;
  let fixture: ComponentFixture<MaloComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MaloComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MaloComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should fail', () => {
    const fixture = TestBed.createComponent(MaloComponentComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('p').textContent).toContain('no contiene esto');
  });

});
