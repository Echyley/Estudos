package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() { // toString já é uma subclasse de object, ao declara-lo é possível editá-lo.
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + "units, total: $"
                + String.format("%.2f", totalValueInStock());

    }

}
