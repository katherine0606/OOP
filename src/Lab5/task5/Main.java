package Lab5.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
                "1. An eagle, if pressed for food, might … a small baby that had been left in the open.",
                "2. Their education system is a good example of the fact that it is possible to … very extensive readjustments.",
                "3. This chemical compound helps … waste products from the liver.",
                "4. The government announced its plan to … cultural reform."};
        String[][] answers = {
                {"a) carry off", "b) carry out", "c) carry on with"},
                {"a) carry off", "b) carry away", "c) carry through"},
                {"a) carry away", "b) carry over", "c) carry on with"},
                {"a) carry off", "b) carry out", "c) carry away"}
        };
        String[] correctAnswers = {"a", "c", "a", "b"};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String answer : answers[i]){
                System.out.println(answer);
            }
            System.out.print("Enter your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();
            boolean validAnswer = false;

            while (!validAnswer) {
                if (userAnswer.equals("a") || userAnswer.equals("b") || userAnswer.equals("c")){
                    validAnswer = true;
                } else {
                    System.out.print("Invalid answer. Please enter a, b, or c");
                    userAnswer = scanner.nextLine().toLowerCase();
                }
            }
            if(userAnswer.equals(correctAnswers[i])){
                System.out.println("Well done! It`s correct!");
                score++;
            } else {
                System.out.println("Sorry, that`s incorrect. The correct answer is: " + correctAnswers[i]);
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
