import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Account } from 'src/app/binding/account';
import { AccountService } from 'src/app/service/account.service';

@Component({
  selector: 'app-accountedit',
  templateUrl: './accountedit.component.html',
  styleUrls: ['./accountedit.component.css'],
})
export class AccounteditComponent implements OnInit {
  userId: number = 0;
  account: Account = new Account();
  msg: string = '';

  ngOnInit(): void {
    this.getAccount();
  }

  constructor(
    private accService: AccountService,
    private router: Router,
    private activeRouter: ActivatedRoute
  ) {}

  onSubmit() {
    this.accService.createAccount(this.account).subscribe((data) => {
      this.msg = data.toString();
    });
  }

  getAccount() {
    this.userId = this.activeRouter.snapshot.params['id'];

    this.accService.getAccountById(this.userId).subscribe((data) => {
      this.account = data;
      console.log(this.account);
    });
  }
}
