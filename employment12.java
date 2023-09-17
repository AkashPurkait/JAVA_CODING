import java.util.*;
class employee{
String Name;
String Designation;
int EmployeeId;
double Salary;
employee(String name)
{
this.Name=name;
}
employee(int employeeid){
this.EmployeeId=employeeid;
}
employee(double salary,String designation){
this.Salary=salary;
this.Designation=designation;
}

}
class employment12{
public static void main(String[]args){
System.out.println("enter their details : ");
Scanner sc = new Scanner(System.in);
System.out.println("NAME:");
String name=sc.nextLine();
System.out.println("DESIGNATION:");
String designation = sc.nextLine();;
System.out.println("SALARY:");
double salary = sc.nextDouble();
System.out.println("EMPLOYEEID:");
int employeeid= sc.nextInt();
employee a1 = new employee(name);
employee a2 = new employee(employeeid);
employee a3 = new employee(salary,designation);

System.out.println("EMPLOYEE NAME    EMPLOYEEID    EMPLOYEE SALARY    EMPLOYEE DESIGNATION");
System.out.print("      "+ a1.Name);
System.out.print("      "+ a2.EmployeeId);
System.out.print("      "+ a3.Salary);
System.out.print("      "+ a3.Designation);
}
}