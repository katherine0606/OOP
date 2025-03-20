package Lab3.Lesson;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
       /* int number = 10;
        while (number>=0){
            System.out.println("Number is: " + number);
            number--;
        }
        System.out.println("Finish!");

        int count = 1;
        while (true){
            System.out.println("Current counter: " + count);
            if (count > 3){
                break;
            }
            count++;
        }*/



        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()){
            System.out.print("Введіть ім'я: ");
            name = scanner.nextLine();
        }
        System.out.println("Привіт " + name);
        scanner.close();
    }
}
