//Define an interface Bank with methods deposit() and withdraw(). Create classes SavingsAccount and CurrentAccount that implement the 
//Bank interface. Override the methods to perform account-specific actions.

import java.util.*;

interface bank {

    void deposit();

    void withdraw();
}

class SavingsAccount implements bank {
    double money = 50000.00;

    public void deposit() {
        System.out.println("~~~~SAVINGACCOUNT~~~~");
        double a = this.money;
        System.out.println(" THE AMOUNT THAT YOU WANT TO DEPOSIT : ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        System.out.println("THE TOTAL MONEY : " + (a + amount));

    }

    public void withdraw() {
        double k = this.money;
        System.out.println(" THE AMOUNT THAT YOU WANT TO WITHDRAW : ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        System.out.println("THE TOTAL MONEY : " + (k - amount));
    }

}

class CurrentAccount implements bank {

    double money = 50000.00;

    public void deposit() {
        System.out.println("~~~~CURRENTACCOUNT~~~~");
        double a = this.money;
        System.out.println(" THE AMOUNT THAT YOU WANT TO DEPOSIT : ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        System.out.println("THE TOTAL MONEY : " + (a + amount));

    }

    public void withdraw() {
        double k = this.money;
        System.out.println(" THE AMOUNT THAT YOU WANT TO WITHDRAW : ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        System.out.println("THE TOTAL MONEY : " + (k - amount));
    }
}

class banking {
    public static void main(String[] args) {
        bank a1 = new SavingsAccount();
        a1.deposit();
        a1.withdraw();
        bank a2 = new CurrentAccount();
        a2.deposit();
        a2.withdraw();

    }
}