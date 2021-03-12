import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SnapTestComponentComponent } from './snap-test-component/snap-test-component.component';

const routes: Routes = [{ path: 'snap', component: SnapTestComponentComponent},];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
