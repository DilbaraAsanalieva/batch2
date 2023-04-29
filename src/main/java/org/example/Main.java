package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Question question = new Question();
        question.setQuestions("What year did Christopher Columbus discover America?");
//        question.setAnswers();

        //1.What year did Christopher Columbus discover America?
        //2.Who was the first president of the United States?
        //3.What famous document begins with the words "When in the course of human events..."?
        //4.Who was the queen of Egypt who aligned herself with Julius Caesar and Marc Antony?
        //5.What was the name of the famous emperor who built a wall across northern Britain?
        //6.Who was the leader of Nazi Germany during World War II?
        //7.Who was the first female prime minister of the United Kingdom?
        //8.In what year did World War I end?
        //9.What event in 1773 protested British taxes on tea?
        //10.Who was the famous civil rights leader who gave the "I Have a Dream" speech?


        Category category = new Category();


        Game game = new Game();

        int chooseCategory;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 history ");
        System.out.print("2 math ");
        System.out.print("3 computer ");
        System.out.print("Choose category:  ");
        chooseCategory=scanner.nextInt();



        if(chooseCategory == 1){

        }




    }
}