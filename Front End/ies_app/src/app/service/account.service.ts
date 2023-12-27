import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Account } from '../binding/account';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class AccountService {
  private baseUrl = 'http://localhost:5050';

  constructor(private http: HttpClient) {}

  createAccount(account: Account): Observable<Object> {
    return this.http.post(`${this.baseUrl}/user`, account);
  }

  getAccounts(): Observable<Account[]> {
    return this.http.get<Account[]>(`${this.baseUrl}/users`);
  }

  getAccountById(id: number): Observable<Account> {
    return this.http.get<Account>(`${this.baseUrl}/user/${id}`);
  }

  updateAccountStatus(id: number, status: string): Observable<Account[]> {
    return this.http.put<Account[]>(
      `${this.baseUrl}/user/${id}/${status}`,
      null
    );
  }
}
