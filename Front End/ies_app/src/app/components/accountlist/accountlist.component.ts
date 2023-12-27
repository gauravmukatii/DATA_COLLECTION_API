import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Account } from 'src/app/binding/account';
import { AccountService } from 'src/app/service/account.service';

@Component({
  selector: 'app-accountlist',
  templateUrl: './accountlist.component.html',
  styleUrls: ['./accountlist.component.css'],
})
export class AccountlistComponent implements OnInit {
  accounts: Account[] = [];

  constructor(private accService: AccountService, private router: Router) {}

  ngOnInit(): void {
    this.getAllAccounts();
  }

  getAllAccounts() {
    this.accService.getAccounts().subscribe(
      (data) => {
        console.log(data);
        this.accounts = data;
      },
      (error) => {
        console.error(error);
      }
    );
  }

  editAccount(id: number) {
    this.router.navigate(['/edit', id]);
  }

  updateAccount(id: number, status: string) {
    this.accService.updateAccountStatus(id, status).subscribe((data: any) => {
      console.log(data);
    });
  }
}
