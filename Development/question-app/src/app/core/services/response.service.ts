import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { QuestionResponse } from 'src/app/shared/models/questionResponse.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ResponseService {

  private responseUrl: string;

  constructor(private http: HttpClient) {
    this.responseUrl = "http://192.168.99.100:8080/responses";
  }

  public findAll(): Observable<QuestionResponse[]> {
    return this.http.get<QuestionResponse[]>(this.responseUrl);
  }
}
