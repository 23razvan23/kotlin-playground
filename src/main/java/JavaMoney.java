package main.java;

public class JavaMoney implements Cloneable {

    private int amount;
    private String currency;

    public JavaMoney(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaMoney javaMoney = (JavaMoney) o;

        if (amount != javaMoney.amount) return false;
        return currency != null ? currency.equals(javaMoney.currency) : javaMoney.currency == null;
    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JavaMoney{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
