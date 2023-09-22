//Develop an interface Fruit with methods isSweet() and getVitaminContent(). Implement
// classes Apple and Orange that implement the Fruit interface. Override the methods to
// provide fruit-specific information.

import java.util.Scanner;

interface fruit {
    void isSweet();

    void getVitamin();
}

class Apple implements fruit {
    public void isSweet() {
        System.out.println(" ~APPLE IS SWEET~ ");
    }

    public void getVitamin() {
        System.out.println(" ~APPLE CONTAINS VITAMIN D AND VITAMIN E~ ");
    }
}

class Orange implements fruit {
    public void isSweet() {
        System.out.println(" ~ORANGE IS SWEET AND SAURE~ ");
    }

    public void getVitamin() {
        System.out.println(" ~APPLE CONTAINS VITAMIN C , VITAMIN D AND VITAMIN E~ ");
    }
}

class fruity {
    public static void main(String[] args) {
        fruit Apple = new Apple();

        fruit Orange = new Orange();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter 1 for apple and 2 for orange : ");
            int n = sc.nextInt();
            switch (n) {

                case 1:
                    Apple.isSweet();
                    Apple.getVitamin();
                    break;
                case 2:
                    Orange.isSweet();
                    Orange.getVitamin();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("bhai bhul bhal likhis na thik thak choose kor");
            }
        }
    }
}