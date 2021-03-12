import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SnapTestComponentComponent } from './snap-test-component.component';


describe('SnapTestComponentComponent', () => {
  let component: SnapTestComponentComponent;
  let fixture: ComponentFixture<SnapTestComponentComponent>;
  const itemWithImage = {
    name: 'Corgi',
    photoUrl: 'https://some-image',
  };

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SnapTestComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SnapTestComponentComponent);
    component = fixture.componentInstance;
    //component.item = itemWithImage;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should render with image', () => {
    expect(fixture).toMatchSnapshot(); 
  });
});
