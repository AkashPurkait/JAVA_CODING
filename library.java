//b) Design a class Book with attributes title, author, isbn, and price. Create constructors to initialize objects based on different combinations of attributes. Write a method to display book information.

import java.util.*;
class Book{
String title;
String author;
int isbn_code;
double price;
Book(String title,String author,int isbn_code,double price){
this.title=title;
this.isbn_code=isbn_code;
this.price=price;
this.author=author;
}
Book(String title,int isbn_code,double price,String author){
this.title=title;
this.isbn_code=isbn_code;
this.price=price;
this.author=author;
}
}
class library{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("TITLE OF THE BOOK:");
String title = sc.nextLine();
System.out.print("AUTHOR OF THE BOOK:");
String author= sc.nextLine();
System.out.print("ISBN_CODE OF THE BOOK:");
int isbn_code= sc.nextInt();
System.out.print("PRICE OF THE BOOK:");
double price = sc.nextDouble();
Book a1 = new Book(title,author,isbn_code,price);
Book a2 = new Book(title,isbn_code,price,author);
System.out.println(" "+a1.title+" "+a1.author+" "+a1.isbn_code+" "+a1.price);
System.out.println(" "+a2.title+" "+a2.isbn_code+" "+a2.price+" "+a2.author);
}
}