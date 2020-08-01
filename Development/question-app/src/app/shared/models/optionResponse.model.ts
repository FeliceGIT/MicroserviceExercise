import { Option } from "./option.model";

export class OptionResponse {

  option: Option;

  constructor(option?: Option) {
    this.option = option;
  }
}
