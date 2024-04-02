import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);

        //Classe Abstrata
        List<Account> list = new ArrayList<>();
        
        list.add(new SavingsAccount(1001, "Kino", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Hermes", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Echy", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Deku", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }
        for (Account acc : list){
            System.out.printf("Updated balance for %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}