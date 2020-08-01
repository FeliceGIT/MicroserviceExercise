import { Component, OnInit } from '@angular/core';
import { QuestionService } from 'src/app/core/services/question.service';
import { Question } from 'src/app/shared/models/question.model';
import { Option } from 'src/app/shared/models/option.model';
import { OptionResponse } from 'src/app/shared/models/optionResponse.model';
import { ResponseService } from 'src/app/core/services/response.service';
import { QuestionResponse } from 'src/app/shared/models/questionResponse.model';

@Component({
  selector: 'app-question-list',
  templateUrl: './question-list.component.html',
  styleUrls: ['./question-list.component.scss']
})
export class QuestionListComponent implements OnInit {

  constructor(public questionService: QuestionService, public responseService: ResponseService) { }

  ngOnInit() {
    this.questionService.findAll().subscribe(data => {
    this.questions = data;
    });
  }

  questions: Question[] = [];

  selectedQuestion: Question;
  selectedOption: Option;

  setSelectedQuestion(event: any, question: Question) {
    this.selectedQuestion = question;
  }

  changeHandlerRadio(event: any, option: Option) {
    this.selectedOption = option;
  }

  optionSelected(): boolean {
    return this.selectedOption ? true : false;
  }

  saveResponse() {
    this.responseService.questionResponse = new QuestionResponse(this.selectedQuestion, new OptionResponse(this.selectedOption));
    this.responseService.saveQuestionResponse(this.responseService.questionResponse).subscribe(
      result => console.log(this.responseService.questionResponse));
  }
}
