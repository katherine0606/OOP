package Lab2.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведіть ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();
        scanner.close();
        System.out.println("println: Ім'я: " + name + ", Вік: " + age);
        System.out.printf("printf: Ім'я: %s, Вік: %d%n", name, age);
    }
}
