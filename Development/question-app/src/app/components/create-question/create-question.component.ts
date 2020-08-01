import { Component, OnInit } from '@angular/core';
import { QuestionService } from 'src/app/core/services/question.service';
import { Router } from '@angular/router';
import { Option } from 'src/app/shared/models/option.model';

@Component({
  selector: 'app-create-question',
  templateUrl: './create-question.component.html',
  styleUrls: ['./create-question.component.scss']
})
export class CreateQuestionComponent implements OnInit {

  constructor(public questionService: QuestionService, public router: Router) { }

  ngOnInit() {
    this.questionService.question.options.push(new Option(""));
  }

  addOption() {
    this.questionService.question.options.push(new Option(""));
  }

  onSubmit() {
    console.log(this.questionService.question);
    this.questionService.saveQuestion(this.questionService.question).subscribe(result => this.gotoStatistics());
  }

  gotoStatistics() {
    this.router.navigate(['']);
  }
}
