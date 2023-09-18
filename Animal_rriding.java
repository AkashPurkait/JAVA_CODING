//Define an interface Animal with a method makeSound(). Create classes Dog and Cat that implement the Animal interface. Override the makeSound() method to make 
//appropriate sounds for each animal.

interface Animal {
    void makeSound();
}

class Dog implements Animal {

    public void makeSound() {

        System.out.println(">>>>BBBAARRKKKKKKKKKK<<<<<<<");
        System.out.println("BBHHHAAUUUU");
    }
}

class Cat implements Animal {

    public void makeSound() {

        System.out.println("~~~~~~meow~~~~~~");
        System.out.println(">>>>WWWWWEEEAAAAWWWWWWWWWW<<<<");
    }
}

class Animal_rriding {

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
}