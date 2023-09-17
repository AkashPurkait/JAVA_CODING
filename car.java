// Design a class Vehicle with attributes make, model, year, and price. Provide constructors to initialize objects using different 
//combinations of attributes. Overload a method to display vehicle details, including its make, model, and year.

import java.util.Scanner;

class vehicle {

    String model;
    int year;
    double price;

    vehicle(String model, int year, double price) {

        this.model = model;
        this.year = year;
        this.price = price;
    }

    vehicle(String model, double price, int year) {

        this.model = model;
        this.price = price;
        this.year = year;

    }

    void display() {

    }

    void display(int i) {

        System.out.println("THE DETAILS OF THE CAR");
        System.out.println(" CAR MODEL : " + model + " CAR PRICE : " + price + " CAR YEAR : " + year);
    }
}

class car {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year : ");
        int year = sc.nextInt();
        System.out.println("enter the price : ");
        double price = sc.nextDouble();
        System.out.println("enter the model : ");
        String model = sc.nextLine();
        vehicle a1 = new vehicle(model, year, price);
        vehicle a2 = new vehicle(model, price, year);
        a2.display();
        a2.display(12);
    }
}