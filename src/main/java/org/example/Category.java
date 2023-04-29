package org.example;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private List<Question> questionsList;

    private int category;

    public Category(){}



    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }




    public  void  addQuestion(Question question){
        questionsList.add(question);
    }



    public void retrieveQuestion(){
        for (int i=0; i< questionsList.size(); i++) {
            System.out.println(i);
        }

    }


    public Category(List<Question> questionsList) {
        this.questionsList = questionsList;
    }

    public List<Question> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Question> questionsList) {
        this.questionsList = questionsList;
    }
}
