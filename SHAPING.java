//Create an interface Shape with a method draw(). Implement classes Circle, Rectangle, and
// Triangle that implement the Shape interface. Override the draw() method to display ASCII 
//art of each shape.

interface Shape {
    void draw();
}

class circle13 implements Shape {
    public void draw() {
        System.out.println(" ASCII aRt for CIRCLE ");
    }
}

class triangle13 implements Shape {
    public void draw() {
        System.out.println(" ASCII aRt for TRIANGLE ");
    }
}

class rectangle13 implements Shape {
    public void draw() {
        System.out.println(" ASCII aRt for RECTANGLE ");
    }
}

class SHAPING {
    public static void main(String[] args) {
        Shape a1 = new circle13();
        Shape a2 = new triangle13();
        Shape a3 = new rectangle13();
        a1.draw();
        a2.draw();
        a3.draw();
    }
}