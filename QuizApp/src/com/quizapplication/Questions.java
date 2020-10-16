package com.quizapplication;

import java.util.Scanner;

public class Questions {
    String question,option1,option2,option3,option4;
    int userAnswer,correctAnswer;

    Scanner sc = new Scanner(System.in);

    public boolean askQuestion(){
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
       // answer = sc.nextInt();
        userAnswer = sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
        return false;
    }
}

