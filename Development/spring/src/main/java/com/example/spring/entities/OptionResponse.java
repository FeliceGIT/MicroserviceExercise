package com.example.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OptionResponse {

  @Id
  @Column(name = "option_response_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long optionResponseId;

  @Column(name = "option_response_text")
  private String optionResponseText;

  @ManyToOne
  @JoinColumn(name = "option_id")
  private Option option;

  @ManyToOne
  @JoinColumn(name = "question_response_id")
  private QuestionResponse questionResponse;

  public OptionResponse() {

  }

  public OptionResponse(Long optionResponseId, String optionResponseText,
   Option option, QuestionResponse questionResponse) {
    this.optionResponseId = optionResponseId;
    this.optionResponseText = optionResponseText;
    this.option = option;
    this.questionResponse = questionResponse;
  }

  public Long getOptionResponseId() {
    return optionResponseId;
  }

  public void setOptionResponseId(Long optionResponseId) {
    this.optionResponseId = optionResponseId;
  }

  public Option getOption() {
    return option;
  }

  public void setOption(Option option) {
    this.option = option;
  }

  public String getOptionResponseText() {
    return optionResponseText;
  }

  public void setOptionResponseText(String optionResponseText) {
    this.optionResponseText = optionResponseText;
  }

  public QuestionResponse getQuestionResponse() {
    return questionResponse;
  }

  public void setQuestionResponse(QuestionResponse questionResponse) {
    this.questionResponse = questionResponse;
  }
}