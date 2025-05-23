package Lab12.task4;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new BookProduct("The Chronicles of Amber", 29.99, 1, "Roger Zelazny"));
        products.add(new ElectronicsProduct("Smartphone", 1149.99, 2, "Apple"));
        products.add(new FoodProduct("Cheese", 5.99, 3, "04.06.25"));

        for (Product product : products) {
            product.displayInfo();
            System.out.println(product.getDescription());
            System.out.println();
        }

        System.out.println("Applying discounts:");
        for (Product product : products) {
            if (product instanceof Discountable) {
                ((Discountable) product).applyDiscount(20.0);
                product.displayInfo();
            }
        }
    }
}
