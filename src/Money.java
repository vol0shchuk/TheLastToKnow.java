public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
        norm();
    }

    private void norm() {
        if (cents >= 100) {
            dollars += cents / 100;
            cents = cents % 100;
        }
    }

    public void show() {
        System.out.println("Сума: " + dollars + " доларів " + cents + " центів");
    }

    public int dollar() {
        return dollars;
    }

    public int cent() {
        return cents;
    }

    public void amount(int dollars, int cents) {
        int total = (this.dollars * 100 + this.cents) - (dollars * 100 + cents);
        this.dollars = total / 100;
        this.cents = total % 100;
        norm();
    }

    public boolean isGreaterThan(Money other) {
        int total1 = this.dollars * 100 + this.cents;
        int total2 = other.dollars * 100 + other.cents;
        return total1 > total2;
    }
}
