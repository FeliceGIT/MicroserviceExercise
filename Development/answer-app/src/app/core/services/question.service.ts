import { Injectable } from '@angular/core';
import { Question } from 'src/app/shared/models/question.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  private questionUrl: string;

  constructor(private http: HttpClient) {
    this.questionUrl = "http://192.168.99.100:8080/questions";
   }

   public findAll(): Observable<Question[]> {
     return this.http.get<Question[]>(this.questionUrl);
   }
}
