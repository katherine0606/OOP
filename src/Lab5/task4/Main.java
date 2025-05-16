package Lab5.task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int amountOfCubes;
        int sum = 0;
    }

    static void print(int roll){
        switch (roll){
            case 1:
                System.out.println("""
                        +-------+
                        /       /
                        /       /
                        /   *   /
                        /       /
                        /       /
                        +-------+
                        """);
                break;
            case 2:
                System.out.println("""
                        +-------+
                        /       /
                        /       /
                        /   **  /
                        /       /
                        /       /
                        +-------+
                        """);
                break;
            case 3:
                System.out.println("""
                        +-------+
                        /       /
                        /   *   /
                        /   **  /
                        /       /
                        /       /
                        +-------+  
                        """);
        }
    }
}
