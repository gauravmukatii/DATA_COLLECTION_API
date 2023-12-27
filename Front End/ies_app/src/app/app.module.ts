import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CreateaccountComponent } from './components/createaccount/createaccount.component';
import { AccountlistComponent } from './components/accountlist/accountlist.component';
import { AccounteditComponent } from './components/accountedit/accountedit.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateaccountComponent,
    AccountlistComponent,
    AccounteditComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
