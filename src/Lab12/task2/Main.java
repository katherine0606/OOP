package Lab12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    static final String[] products = {"1. Apple", "2. Banana", "3. Carrot", "4. Potato", "5. Milk", "6. Chicken"};
    static final List<String> cart = new ArrayList<>();


    public static void main(String[] args) {
        while (true) {
            showProducts(products);
            showMenu();
            System.out.print("Enter user choice: ");
            int choice = getUserInput();
            handleUserChoice(choice);
        }
    }

    public static void showProducts(String[] products) {
        System.out.println("\nAvailable products:");
        for (String product : products) {
            System.out.println(product);
        }
    }

    public static void addToCart(int productNumber) {
        if (productNumber >= 1 && productNumber <= products.length){
            cart.add(products[productNumber - 1]);
            System.out.println(products[productNumber - 1] + " added to cart");
        } else {
            System.out.println("Invalid product number. Please try again");
        }
    }

    public static void viewCart() {
        if(cart.isEmpty()){
            System.out.println("Your cart is empty");
        } else {
            System.out.println("Your cart contains:");
            for (String item : cart) {
                System.out.println(item);
            }
        }
    }

    private static void exitApp(){
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }

    public static void showMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add to cart");
        System.out.println("2. View cart");
        System.out.println("3. Exit");
    }

    public static int getUserInput(){
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter product number to put in cart: ");
                int productNumber = getUserInput();
                addToCart(productNumber);
                break;
            case 2:
                viewCart();
                break;
            case 3:
                exitApp();
            default:
                System.out.println("Invalid choice. Please try again");
        }
    }
}
