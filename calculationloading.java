class calculator360{
int a;
int b;
double c;
double d;
int e;
double f;

void add(int a , int b){
this.a=a;
this.b=b;
System.out.println("sum of integer numbers : "+ (a+b));
}
void add(double c, double d){
this.c=c;
this.d=d;
System.out.println("sum of two double number : "+ (c+d));
}
void add(int e,double f){
this.e=e;
this.f=f;
double i;
i=e+f;
System.out.println("sum of a integer and a double : "+i);
}
}


class calculationloading{
public static void main(String[]args){
calculator360 a1 = new calculator360();

a1.add(4,5);
a1.add(2.5,7.5);
a1.add(4,3.9);
}
}