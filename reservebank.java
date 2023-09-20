//Design an interface CurrencyConverter with a method convertCurrency(). Implement classes
// DollarConverter and EuroConverter that implement the CurrencyConverter interface. 
//Override the method to perform currency conversion.

import java.util.Scanner;

interface CurrencyConverter {
    void convertCurrency();
}

class DollarConverter implements CurrencyConverter {
    public void convertCurrency() {
        System.out.println(" HOW MANY AMOUNT THAT YOU WANT TO CONVERT FROM DOLLAR : ");
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        double rupee = dollar * 82.92;
        System.out.println(" THE AMOUNT IN RUPEE :    " + rupee);
    }
}

class EuroConverter implements CurrencyConverter {
    public void convertCurrency() {
        System.out.println(" HOW MANY AMOUNT THAT YOU WANT TO CONVERT FROM EURO : ");
        Scanner sc = new Scanner(System.in);
        int euro = sc.nextInt();
        double rupee = euro * 88.99;
        System.out.println(" THE AMOUNT IN RUPEE :    " + rupee);
    }
}

class Kuwaiti_dinarConverter implements CurrencyConverter {
    public void convertCurrency() {
        System.out.println(" HOW MANY AMOUNT THAT YOU WANT TO CONVERT FROM KUWAITI_DINAR : ");
        Scanner sc = new Scanner(System.in);
        int dinar = sc.nextInt();
        double rupee = dinar * 266.82;
        System.out.println(" THE AMOUNT IN RUPEE :    " + rupee);
    }
}

class reservebank {
    public static void main(String[] args) {
        CurrencyConverter a1 = new DollarConverter();
        a1.convertCurrency();
        CurrencyConverter a2 = new EuroConverter();
        a2.convertCurrency();
        CurrencyConverter a3 = new Kuwaiti_dinarConverter();
        a3.convertCurrency();
    }
}