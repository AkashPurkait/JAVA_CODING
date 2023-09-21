//Develop an interface Language with a method greet(). Implement classes English, French,
// and Spanish that implement the Language interface. Override the greet() method to provide
// greetings in different languages.

interface Language {
    void greet();
}

class english implements Language {
    public void greet() {
        System.out.println(" ~~~~HELLOW~~~~ ");
    }
}

class french implements Language {
    public void greet() {
        System.out.println(" ~~~~BONJOUR~~~~ ");
    }
}

class spanish implements Language {
    public void greet() {
        System.out.println(" ~~~~HOLA~~~~ ");
    }
}

class GREETING {
    public static void main(String[] args) {
        System.out.println(" GREETINGS IN SAVERAL LANGUAGE ");
        Language greeting1 = new english();
        greeting1.greet();
        Language greeting2 = new french();
        greeting2.greet();
        Language greeting3 = new spanish();
        greeting3.greet();
    }
}