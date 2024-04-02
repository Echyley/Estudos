package entities;

public class CurrencyConverter {
    public static double reais;
    public static double dollar;

    public CurrencyConverter(double reais, double dollar) {
        this.reais = reais;
        this.dollar = dollar;
    }

    public static double Conversion() {
        return reais * 5;
    }
}
