import { Component } from '@angular/core';
import { QuestionService } from './core/services/question.service';
import { Question } from './shared/models/question.model';
import { Option } from './shared/models/option.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'answer-app';

  constructor(public questionService: QuestionService) {

  }

  questions: Question[] = [];

  ngOnInit() {
      this.questionService.findAll().subscribe(data => {
      this.questions = data;
    });
  }
}
