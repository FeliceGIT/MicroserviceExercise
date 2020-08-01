import { Injectable } from '@angular/core';
import { Question } from 'src/app/shared/models/question.model';
import { HttpClient } from '@angular/common/http';
import { Option } from 'src/app/shared/models/option.model';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  question: Question = new Question("", []);

  private questionUrl: string;

  constructor(private http: HttpClient) {
    this.questionUrl = "http://192.168.99.100:8080/questions";
   }

   public saveQuestion(question: Question) {
     return this.http.post<Question>(this.questionUrl, question);
   }
}
