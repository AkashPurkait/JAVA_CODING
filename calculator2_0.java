
import java.util.Scanner;

class calculator {
    double n;
    double total;

    void sum() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        // int sum = 0;
        if (n != 0) {
            total = 0;
            total = total + n + a;
            n = 0;
        } else {
            total = total + a;
        }
        System.out.println(total);

    }

    void sub() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        // double sub= 0;
        if (n != 0) {
            total = 0;
            total = total + n;
            total = total - a;
            n = 0;
        } else {
            total = total - a;
        }
        System.out.println(total);
    }

    void mul() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        // int l = 1;
        if (n != 0) {
            total = 1;
            total = total * a;
            n = 0;
        } else {
            total = total * a;
        }
        System.out.println(total);
    }

    void div() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        // double div

        if (n != 0) {
            total = 1;
            total = total * n;
            total = total / a;
            n = 0;
        } else

        {
            total = total / a;
        }
        System.out.println(total);

    }

    void square() {
        if (n != 0) {
            total = 0;
            total = total + n;
            total = total * total;
            n = 0;
        } else {
            total = total * total;
        }
        System.out.println(total);
    }

    void root() {
        if (n != 0) {
            total = 0;
            total = total + n;
            total = Math.sqrt(total);
            n = 0;
        } else {
            total = Math.sqrt(total);
        }
        System.out.println(total);
    }

    calculator(double n, double total) {
        this.n = n;

        this.total = total;
    }
}

class calculator2_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                " :+: FOR SUM , :-: FOR SUB , :*: FOE MUL , :/: FOR DIV , :s: FOR SQUARE , :r: FOR ROOT , :b: FOR GETTING OUT ");
        double n = sc.nextDouble();
        if (n == 0) {
            System.out.println("ERROR");
            System.exit(0);
        }
        // int sum = 0, mul = 1;
        // double sub = 0, div = 1;
        double total = 0;
        calculator a1 = new calculator(n, total);
        while (true) {

            char k = sc.next().charAt(0);
            switch (k) {

                case '+':
                    a1.sum();
                    break;

                case '-':
                    a1.sub();
                    break;

                case '*':
                    a1.mul();
                    break;

                case '/':
                    a1.div();
                    break;
                case 's':
                    a1.square();
                    break;
                case 'r':
                    a1.root();
                    break;

                case 'b':
                    System.exit(0);
                default:
                    System.out.println(" TR BAP BANIYECHE NKI THIK THAK INPUT DE CHOL ");
            }
        }
    }
}
