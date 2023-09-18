//Create an interface Shape with methods calculateArea() and calculatePerimeter(). Implement
// classes Circle and Rectangle that implement the Shape interface. Override the methods to
// provide area and perimeter calculations.

import java.util.*;

interface Shape {

    void calculateArea();

    void calculatePerimeter();

}

class Circle implements Shape {
    public void calculateArea() {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println(" THE AREA OF A CIRCLE : " + area);

    }

    public void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double perimeter = 2 * 3.14 * r;
        System.out.println(" THE PERIMETER OF THE CIRCLE : " + perimeter);
    }
}

class triangle implements Shape {

    public void calculateArea() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(" THE AREA OF A TRIANGLE : " + area);

    }

    public void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double perimeter = a + b + c;
        System.out.println(" THE PERIMETER OF THE TRIANGLE : " + perimeter);
    }
}

class shape_rriding {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();
        Shape triangle = new triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}