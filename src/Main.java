public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Яблуко", 5, 99);
        Product banana = new Product("Банан", 8, 49);

        apple.displayProductInfo();
        banana.displayProductInfo();

        System.out.println();

        apple.decreasePrice(1, 50);
        apple.displayProductInfo();

        System.out.println();

        if (apple.getPrice().isGreaterThan(banana.getPrice())) {
            System.out.println("Яблуко дорожче за банан.");
        } else {
            System.out.println("Яблуко дешевше за банан.");
        }
    }
}
