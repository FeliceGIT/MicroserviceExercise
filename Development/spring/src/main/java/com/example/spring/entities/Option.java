package com.example.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "AnswerOption")
public class Option {

  @Id
  @Column(name = "option_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long optionId;

  @Column(name = "option_text")
  private String text;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "question_id")
  private Question question;

  public Option() {

  }

  public Option(Long optionId, String text, Question question) {
    this.optionId = optionId;
    this.text = text;
    this.question = question;
  }

  public Long getOptionId() {
    return optionId;
  }

  public void setOptionId(Long optionId) {
    this.optionId = optionId;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }
}