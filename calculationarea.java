//Create an interface Shape with a method calculateArea(). Implement classes Circle and Rectangle that implement the Shape interface. Override the calculateArea() method in each class to compute the area of the respective shape


import java.util.*;
interface shapes
{

void calculate();
}

class circle implements shapes
{

public void calculate(){
int r=12;
double c_area = 3.14*r*r;
System.out.println(" THE AREA OF A CIRCLE : " + c_area);
}
}
class triangle implements shapes
{

public void calculate(){

int a=13;
int b=14;
int c=15;
double s =(a+b+c)/2;
double t_area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println(" THE AREA OF A TRIANGLE : "+t_area);
}
}

class calculationarea{

public static void main(String[] args){



shapes a1 = new circle();
a1.calculate();
shapes a2 = new triangle();
a2.calculate();
}

}