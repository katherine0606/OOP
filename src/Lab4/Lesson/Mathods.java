package Lab4.Lesson;

import java.util.Scanner;

public class Mathods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");

        String firstName = scanner.nextLine();
        System.out.print("Enter your laast name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        //String result = constructHelloSentence(name);
        String result = constructHelloSentence(firstName, lastName, age);
        System.out.println(result);
        scanner.close();
    }
    public static String constructHelloSentence(String firstName, String lastName, int age) {
    return "Hello world! My name is " + lastName + " "+ firstName + ". You are " + age + " y.o.";
    }
}
