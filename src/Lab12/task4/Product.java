package Lab12.task4;

public abstract class Product {
    protected String name;
    protected double price;
    protected int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public abstract String getDescription();

    public void displayInfo(){
        System.out.println("Product name: " + name);
        System.out.println("Product price: $" + price);
        System.out.println("Product ID: " + id);
    }
}
