package entities;

public class Product {

    String name; // Uma variável sem modificador de acesso só pode ser acessada dentro do seu pacote.
    private double price;
    private int quantity;

    public Product() {
    }

    // O construtor é um metodo que evita valores nulos na instanciação de novos
    // objetos, ele tem o
    // mesmo nome da classe e passa os mesmos parametros dentro dela para evitar que
    // sejam nulos.
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // É possível ter mais de um contrutor com o mesmo nome, desde que seus
    // parametros sejam diferentes.
    // Isso se chama sobrecarga.
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    // Getters e Setters permitem que uma variavel privada seja alterada.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}