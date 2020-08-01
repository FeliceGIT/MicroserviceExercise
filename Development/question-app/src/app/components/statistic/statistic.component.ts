import { Component, OnInit } from '@angular/core';
import { ResponseService } from 'src/app/core/services/response.service';
import { QuestionResponse } from 'src/app/shared/models/questionResponse.model';

@Component({
  selector: 'app-statistic',
  templateUrl: './statistic.component.html',
  styleUrls: ['./statistic.component.scss']
})
export class StatisticComponent implements OnInit {

  constructor(public responseService: ResponseService) { 

  }

  questionResponses: QuestionResponse[] = [];
  

  ngOnInit() {
    this.responseService.findAll().subscribe(data => {
    this.questionResponses = data;
    });
  }

}
