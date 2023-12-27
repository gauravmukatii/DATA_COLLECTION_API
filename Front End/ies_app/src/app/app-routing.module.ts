import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountlistComponent } from './components/accountlist/accountlist.component';
import { AccounteditComponent } from './components/accountedit/accountedit.component';
import { CreateaccountComponent } from './components/createaccount/createaccount.component';

const routes: Routes = [
  { path: 'accounts', component: AccountlistComponent },
  { path: 'edit/:id', component: AccounteditComponent },
  { path: 'create-account', component: CreateaccountComponent },
  { path: '', redirectTo: 'accounts', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
