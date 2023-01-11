import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SalesVisitAddComponent } from './sales-visit-add/sales-visit-add.component';
import { SalesVisitListComponent } from './sales-visit-list/sales-visit-list.component';

const routes: Routes = [
  {path:'',redirectTo:'saleslist',pathMatch:'full'},
  {path:'saleslist',component:SalesVisitListComponent},
  {path:'salesadd',component:SalesVisitAddComponent},
  {path:'salesadd/:visitid',component:SalesVisitAddComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
