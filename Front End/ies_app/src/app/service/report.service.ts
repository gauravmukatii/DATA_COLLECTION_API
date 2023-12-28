import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ReportResponse } from '../binding/report-response';
import { ReportSearchCriteria } from '../binding/report-search-criteria';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ReportService {
  private REPORT_API_URL = 'https://localhost:9090';

  constructor(private httpClient: HttpClient) {}

  getReportData(
    reportSearchCriteria: ReportSearchCriteria
  ): Observable<ReportResponse[]> {
    return this.httpClient.get<ReportResponse[]>(
      `${this.REPORT_API_URL}/report`
    );
  }
}
