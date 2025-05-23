package Lab12.task4;

public class BookProduct extends Product{
    private String author;


    public BookProduct(String name, double price, int id, String author) {
        super(name, price, id);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Book: " + name + ",  written by " + author + ". Costs $" + price;
    }
}
