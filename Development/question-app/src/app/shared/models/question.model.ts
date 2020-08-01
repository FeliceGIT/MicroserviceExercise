import { Option } from './option.model';

export class Question {
  
  text: string;
  options: Option[];
  
  constructor(text?: string, options?: Option[]) {
    this.text = text;
    this.options = options;
  }
}