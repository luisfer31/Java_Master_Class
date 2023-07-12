package javaamigos.a1.packagelearn.bank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String amigos = "Amigos";
        BankAccount account = new BankAccount(
                amigos,
                BigDecimal.TEN,
                false);

        System.out.println(account.withdraw(new BigDecimal(9)));
        System.out.println(account.getBalance());

        System.out.println();

        System.out.println(account.withdraw(new BigDecimal(1)));
        System.out.println(account.getBalance());

        System.out.println();

        System.out.println(account.withdraw(new BigDecimal(100)));
        System.out.println(account.getBalance());

        account.setBalance(new BigDecimal(1000));
        System.out.println(account.getBalance());
    }
}
