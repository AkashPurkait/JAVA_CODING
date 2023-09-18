//Create an interface Employee with methods calculateSalary() and displayDetails(). Implement classes Manager and Developer that implement the Employee interface. Override the methods to calculate salary and display details.

import java.util.Scanner;

interface employee {

    void calculateSalary();

    void displayDetails();
}

class manager1 implements employee {
    public void calculateSalary() {
        System.out.println(" A MANAGERS DAILY SALARY IS 5000 RS");
        System.out.println("HOW MANY DAYS HE/SHE TOOK HOLIDAYS IN A MONTH");
        Scanner sc = new Scanner(System.in);
        int holiday = sc.nextInt();
        int work_day = 30 - holiday;
        double daily_salary = 5000.00;
        System.out.println("AS THE WORK HOURS ARE FOR " + work_day + "DAY THE SALARY IS APROXIMATELY : "
                + (work_day * daily_salary));
    }

    public void displayDetails() {
        System.out.println("give the details of the employee : ");
        Scanner sc = new Scanner(System.in);
        String details = sc.nextLine();
        System.out.println("the details of the employee : " + details);
    }
}

class devoloper1 implements employee {
    public void calculateSalary() {
        System.out.println(" A DEVOLOPERSS DAILY SALARY IS 3000 RS");
        System.out.println("HOW MANY DAYS HE/SHE TOOK HOLIDAYS IN A MONTH");
        Scanner sc = new Scanner(System.in);
        int holiday = sc.nextInt();
        int work_day = 30 - holiday;
        double daily_salary = 3000.00;
        System.out.println("AS THE WORK HOURS ARE FOR " + work_day + "DAY THE SALARY IS APROXIMATELY : "
                + (work_day * daily_salary));
    }

    public void displayDetails() {
        System.out.println("give the details of the employee : ");
        Scanner sc = new Scanner(System.in);
        String details = sc.nextLine();
        System.out.println("the details of the employee : " + details);
    }
}

class employee_rriding {
    public static void main(String[] args) {
        employee a1 = new manager1();
        a1.calculateSalary();
        a1.displayDetails();
        employee a2 = new devoloper1();
        a2.calculateSalary();
        a2.displayDetails();
    }
}