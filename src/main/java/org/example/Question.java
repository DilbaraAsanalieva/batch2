package org.example;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String questions;
    private String[] answers;
    private String correctAnswer;

    public Question(){}

    public Question(String questions,  String correctAnswer) {
        this.questions = questions;
        this.correctAnswer = correctAnswer;
    }
    public Question( String[] answers) {

        this.answers = answers;

    }


    public String getCorrectAnswer() {
        return correctAnswer;
    }




    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}
