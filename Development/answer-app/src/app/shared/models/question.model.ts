import { Option } from './option.model';

export class Question {
  
  id: number;
  text: string;
  options: Option[];
  
  constructor(id?: number, text?: string, options?: Option[]) {
    this.id = id;
    this.text = text;
    this.options = options;
  }
}