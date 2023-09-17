// Build a class ShapeCalculator with methods to calculate the area of different shapes. Implement methods for calculating the area of a rectangle, a circle, and a triangle. Use method overloading to accommodate varying input parameters.

import java.util.*;
class shapecalculator{
int r;
int a;
int b;
int c;
int d;
int e;




void area(int r){
this.r=r;
double a=3.14*r*r;
System.out.println("AREA OF A CIRCLE : "+a);
}
void area(int a, int b, int c){
this.a=a;
this.b=b;
this.c=c;
double s = (a+b+c)/2;
double ar =Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("AREA OF A TRIANGLE : "+ar); 
}
void area(int d , int e){
this.d=d;
this.e=e;
double m=d*e;
System.out.println("AREA OF A RECTANGLE : "+m);
}
}

class shapescal{

public static void main(String[]args){
shapecalculator a1 = new shapecalculator();
a1.area(5);
a1.area(4,3,5);
a1.area(3,5);
}
}