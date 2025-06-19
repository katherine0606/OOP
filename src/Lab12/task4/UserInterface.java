package Lab12.task4;

import java.util.Scanner;

public class UserInterface {
    private ProductManager manager;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface(ProductManager manager){
        this.manager = manager;
    }

    public void start(){

        while (true) {
            System.out.println("\n*** Menu +++");
            System.out.println("1. Display all products");
            System.out.println("2. Apply discount to products");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.displayProducts();
                    break;
                case 2:
                    System.out.print("Enter discount percentage: ");
                    double discountPercent = scanner.nextDouble();
                    if (discountPercent < 0 || discountPercent > 100){
                        System.out.println("Invalid discount percentage. Please enter a value between 0 and 100");
                    }else {
                        manager.applyDiscounts(discountPercent);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}
