package Lab12.task4;

public class FoodProduct extends Product implements Discountable{
    private String expirationDate;

    public FoodProduct(String name, double price, int id, String expirationDate) {
        super(name, price, id);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDescription(){
        return "Food product: " + name + ", which expires on " + expirationDate + ". Costs $" + price;
    }

    @Override
    public void applyDiscount(double percent){
        price -= price * percent / 100;
    }
}
