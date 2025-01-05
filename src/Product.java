public class Product {
    private String name;
    private Money price;

    public Product(String name, int dollars, int cents) {
        this.name = name;
        this.price = new Money(dollars, cents);
    }

    public void displayProductInfo() {
        System.out.print("Продукт: " + name + ", ");
        price.show();
    }

    public void decreasePrice(int dollars, int cents) {
        price.amount(dollars, cents);
    }

    public Money getPrice() {
        return price;
    }
}
