import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Account } from 'src/app/binding/account';
import { AccountService } from 'src/app/service/account.service';

@Component({
  selector: 'app-createaccount',
  templateUrl: './createaccount.component.html',
  styleUrls: ['./createaccount.component.css'],
})
export class CreateaccountComponent implements OnInit {
  account: Account = new Account();

  msg: string = '';

  constructor(private accountService: AccountService, private router: Router) {}

  ngOnInit(): void {}

  onSubmit() {
    this.saveAccount();
  }

  saveAccount() {
    this.accountService.createAccount(this.account).subscribe(
      (response) => {
        console.log(response);
        this.msg = 'Account Created successfully';
      },
      (error) => {
        console.error(error);
      }
    );
  }
}
