//Build an interface Bird with methods fly() and sing(). Implement classes Sparrow and 
//Penguin that implement the Bird interface. Override the methods to provide appropriate 
//behaviors.

interface bird {
    void fly();

    void sing();
}

class Sparrow implements bird {
    public void fly() {
        System.out.println(" ~THE SPARROW CAN FLY~ ");
    }

    public void sing() {
        System.out.println(" ~THE SPARROW CAN SING~ ");
    }
}

class Penguin implements bird {
    public void fly() {
        System.out.println(" ~THE PENGUIN CAN NOT FLY~ ");
    }

    public void sing() {
        System.out.println(" ~THE PENGUIN CAN NOT SING~ ");
    }
}

class birdnest {
    public static void main(String[] args) {
        bird a1 = new Sparrow();
        a1.fly();
        a1.sing();
        bird a2 = new Penguin();
        a2.fly();
        a2.sing();
    }
}