import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PruebaComponentComponent } from './prueba-component/prueba-component.component';
import { MaloComponentComponent } from './malo-component/malo-component.component';
import { AssertsComponentComponent } from './asserts-component/asserts-component.component';
import { Mock1ComponentComponent } from './mock1-component/mock1-component.component';
import { Mock2ComponentComponent } from './mock2-component/mock2-component.component';

@NgModule({
  declarations: [
    AppComponent,
    PruebaComponentComponent,
    MaloComponentComponent,
    AssertsComponentComponent,
    Mock1ComponentComponent,
    Mock2ComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
