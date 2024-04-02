package entities;

public class Account {
    private int accNum;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int accNum, String holder) {
        super();
        this.accNum = accNum;
        this.holder = holder;
    }

    public Account(int accNum, String holder, double initialDeposit) {
        super();
        this.accNum = accNum;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + accNum
                + ", Holder: "
                + holder
                + ", Balance: "
                + String.format("%.2f", balance);
    }
}
