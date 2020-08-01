import { OptionResponse } from './optionResponse.model';
import { Question } from './question.model';

export class QuestionResponse {

  question: Question;
  optionResponse: OptionResponse;

  constructor(question?: Question, optionResponse?: OptionResponse) {
    this.question = question;
    this.optionResponse = optionResponse;
  }
}