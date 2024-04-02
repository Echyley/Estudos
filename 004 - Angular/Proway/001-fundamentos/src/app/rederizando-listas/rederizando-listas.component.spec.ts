import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RederizandoListasComponent } from './rederizando-listas.component';

describe('RederizandoListasComponent', () => {
  let component: RederizandoListasComponent;
  let fixture: ComponentFixture<RederizandoListasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RederizandoListasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RederizandoListasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
