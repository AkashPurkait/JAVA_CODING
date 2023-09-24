//Create an interface Animal with methods eat() and sound(). Implement classes Dog and Cat
// that implement the Animal interface. Override the methods to provide animal-specific//
// actions and sounds.

import java.util.Scanner;

interface animal {
    void eat();

    void sound();
}

class dog implements animal {
    public void eat() {
        System.out.println(" DOG EATS MEAT ");
    }

    public void sound() {
        System.out.println(" bbbBBBBAAAAOOOOUUUUuuu ");
    }
}

class cat implements animal {
    public void eat() {
        System.out.println(" CAT EATS FISH ");
    }

    public void sound() {
        System.out.println(" mmmMMMMIIIIAAAAAAUUUUuuu ");
    }
}

class animalplanet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        animal dog = new dog();
        animal cat = new cat();
        while (true) {
            System.out.println(" choose 1 for dog and 2 for cat and press 3 for getting out ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    dog.eat();
                    dog.sound();
                    break;
                case 2:
                    cat.eat();
                    cat.sound();
                case 3:
                    System.exit(0);
                default:
                    System.out.println(" abr sei bhul bhal likhchen to thik thak likhte ki hoi suni ");
            }
        }

    }
}