package com.example.spring.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class QuestionResponse {

  @Id
  @Column(name = "question_response_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long questionResponseId;

  @ManyToOne
  @JoinColumn(name = "question_id")
  private Question question;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "questionResponse")
  private List<OptionResponse> optionResponses;

  public QuestionResponse() {

  }

  public QuestionResponse(Long questionResponseId, Question question,
      List<OptionResponse> optionResponses) {
    this.questionResponseId = questionResponseId;
    this.question = question;
    this.optionResponses = optionResponses;
  }

  public Long getQuestionResponseId() {
    return questionResponseId;
  }

  public void setQuestionResponseId(Long questionResponseId) {
    this.questionResponseId = questionResponseId;
  }

  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  public List<OptionResponse> getOptionResponses() {
    return optionResponses;
  }

  public void setOptionResponses(List<OptionResponse> optionResponses) {
    this.optionResponses = optionResponses;
  }
}