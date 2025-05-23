package Lab12.task4;

public class ElectronicsProduct extends Product{
    private String brand;

    public ElectronicsProduct(String name, double price, int id, String brand) {
        super(name, price, id);
        this.brand = brand;
    }

    @Override
    public String getDescription(){
        return "Electronic device: " + name + ", brand: " + brand + ". Costs $" + price;
    }
}
