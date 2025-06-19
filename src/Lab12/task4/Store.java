package Lab12.task4;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct(new BookProduct("The Chronicles of Amber", 29.99, 1, "Roger Zelazny"));
        manager.addProduct(new ElectronicsProduct("Smartphone", 1149.99, 2, "Apple"));
        manager.addProduct(new FoodProduct("Cheese", 5.99, 3, "04.06.25"));

        UserInterface ui = new UserInterface(manager);
        ui.start();
    }
}
