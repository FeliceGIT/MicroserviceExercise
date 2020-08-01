import { OptionResponse } from './optionResponse.model';
import { Question } from './question.model';

export class QuestionResponse {

  questionResponseId: number;
  question: Question;
  optionResponse: OptionResponse;

  constructor(questionResponseId?: number, question?: Question, optionResponse?: OptionResponse) {
    this.question = question;
    this.optionResponse = optionResponse;
  }
}