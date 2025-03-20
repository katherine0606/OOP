package Lab3.Lesson;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scanner.nextInt();

        String[] cars = new String[arrayLength];
        scanner.nextLine();
        for (int i = 0; i < cars.length; i++) {
            System.out.print("Enter your car: ");
            cars[i] = scanner.nextLine();
        }

        for (String car : cars){
            System.out.println("Car: " + car);
        }
        scanner.close();
    }
}
