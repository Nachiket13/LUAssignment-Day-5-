package com.quizapplication;

public class Game {
    Questions[] questions = new Questions[4];
    Players player = new Players();

    String[] questionsdata = {"Android is developed by___", "Android is based on which kernal ?",
            "Which Company Owned android ?", "Which one is the latest release version of Android ?"};
    String[] options1 = {"Android Inc", "Linux", "Dell", "11"};
    String[] options2 = {"Microsoft", "Window", "Google", "10"};
    String[] options3 = {"Google", "Mac", "HP", "9"};
    String[] options4 = {"TCS","Redhat", "Apple", "8"};
    int[] answers = {1,2,3,4};


    public void initGame() {
        for (int i = 0; i < 4; i++) {
            questions[i] = new Questions();
        }

        questions[0].question = "Android is developed by___";
        questions[0].option1 = "Android Inc";
        questions[0].option2 = "Microsoft";
        questions[0].option3 = "Google";
        questions[0].option4 = "TCS";
        questions[0].correctAnswer = 1;

        questions[1].question = "Android is based on which kernal ?";
        questions[1].option1 = "Linux";
        questions[1].option2 = "Window";
        questions[1].option3 = "Mac";
        questions[1].option4 = "RedHat";
        questions[1].correctAnswer = 1;

        questions[2].question = "Which Company Owned android ?";
        questions[2].option1 = "Dell";
        questions[2].option2 = "Google";
        questions[2].option3 = "HP";
        questions[2].option4 = "Apple";
        questions[2].correctAnswer = 2;

        questions[3].question = "Which one is the latest release version of Android ?";
        questions[3].option1 = "10";
        questions[3].option2 = "11";
        questions[3].option3 = "12";
        questions[3].option4 = "9";
        questions[3].correctAnswer = 2;

        for (int i = 0; i < 4; i++) {

            questions[i].question = questionsdata[i];
            questions[i].option1 = options1[i];
            questions[i].option2 = options2[i];
            questions[i].option3 = options3[i];
            questions[i].option4 = options4[i];
            questions[i].correctAnswer = answers[i];
        }

    }

    public void play() {
        player.getDetails();
        for (int i = 0; i < 4; i++) {
            boolean status = questions[i].askQuestion();
            if (status == true)
            {
                System.out.println("Bilkul Sahi Javab!!");
                player.score = player.score + 5;
            }
            else
                {
                System.out.println("Oops !! Apka Javab Galat Hai...");
                player.score = player.score - 5;
            }
        }

        System.out.println(player.name + " your score is " + player.score);

    }
}
