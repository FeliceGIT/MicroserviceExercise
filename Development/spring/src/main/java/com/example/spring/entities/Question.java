package com.example.spring.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Question {

  @Id
  @Column(name = "question_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long questionId;

  @Column(name = "question_text")
  private String text;

  @JsonManagedReference
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,
   orphanRemoval = true, mappedBy = "question", targetEntity = Option.class)
  private List<Option> options;

  public Question() {

  }

  public Question(Long questionId, String text, List<Option> options) {
    this.questionId = questionId;
    this.text = text;
    this.options = options;
  }
  
  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }

  @Override
  public String toString() {
    return "Question [options=" + options + ", questionId=" + questionId + ", text=" + text + "]";
  }
}