import java.util.Scanner;

class product {

    int productId;
    String productname;
    double price;
    int quantity;

    product(){
}

    product(int productId,String productname,double price, int quantity) {
        this.productId = productId;
        this.productname = productname;
        this.price = price;
        this.quantity = quantity;
    }

    void calculate(){
     
        System.out.println(" "+productId+ " " +productname + " " + price + " " + quantity);
    }

    void calculate(int n) {
        double cost = price * quantity;
        System.out.println(cost);
    }
}

class producer {
   public static void main(String[]args) {

double n= 6.00;
int q = 180;
Scanner sc = new Scanner(System.in);
String k = sc.nextLine();
int a = sc.nextInt();
        product a1 = new product();
      
        product a3 = new product(a,k,n,q);
        
        a3.calculate();
       
        a3.calculate(12);
    }
}