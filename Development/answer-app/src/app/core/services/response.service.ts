import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { QuestionResponse } from 'src/app/shared/models/questionResponse.model';

@Injectable({
  providedIn: 'root'
})
export class ResponseService {

  questionResponse: QuestionResponse = new QuestionResponse();

  private responseUrl: string;

  constructor(private http: HttpClient) {
    this.responseUrl = "http://192.168.99.100:8080/responses";
   }

   public saveQuestionResponse(questionResponse: QuestionResponse) {
     return this.http.post<QuestionResponse>(this.responseUrl, questionResponse);
   }
}
