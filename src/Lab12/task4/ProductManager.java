package Lab12.task4;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void displayProducts(){
        for (Product product : products){
            product.displayInfo();
            System.out.println(product.getDescription());
            System.out.println();
        }
    }

    public void applyDiscounts(double percent){
        for (Product product : products) {
            if (product instanceof Discountable) {
                ((Discountable) product).applyDiscount(percent);
                System.out.println("Discount applied:");
                product.displayInfo();
                System.out.println();
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
