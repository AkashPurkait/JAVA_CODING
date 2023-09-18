//Develop an interface Vehicle with methods start() and stop(). Implement classes Car and Motorcycle that implement the Vehicle interface. Override the methods to provide
// vehicle-specific behaviors.


import java.util.Scanner;
interface Vehicle {
     void start();

     void stop();
}

class car1 implements Vehicle {

    public void start()

    {
     Scanner sc = new Scanner(System.in);
     String a = sc.nextLine();
     
        System.out.println("~~CAR DETAILS OF START~~");
        System.out.println(
                " Lateral overlap values in the range of 40-60% (Figure 5a). If the leader is a two-wheeler, the overlap value is in the range of 0-80%. This is due to larger size of car compared to two-wheelers. If the leader is also a car, sometimes the overlap value exceeds 100% due to the presence of different size of cars in the traffic stream. If the leader is a heavy vehicle, most of the cars have overlap values in the range of 80-120% " +a);
    }

   public void stop() {
Scanner sc = new Scanner(System.in);
     String a = sc.nextLine();
        System.out.println("~~CAR DETAILS OF STOP~~");
        System.out.println(
                "Fuel consumption increases with an increase in idling engine speed (RPM), which leads to increase in the overall average emissions (e.g., NOx, VOCs, etc.) (Pekula et al., 2003). Typically, emission of NOx increases with increasing ambient temperature, depending on the type of vehicle and the idling speed. Fuel consumption and production of CO2 is proportional to engine load, which is directly linked to vehicle accessories power requirements. Accessory loading is determined by the actual accessories and their corresponding power requirements which is different for different loads. " +a);
    }

}

class Motorcycle implements Vehicle {

    public void start()

    {
Scanner sc = new Scanner(System.in);
     String a = sc.nextLine();
        System.out.println("~~BIKE DETAILS OF START~~");
        System.out.println(
                " a subject vehicle (follower), high frequency of lateral overlap values occur in the range of 80-100% (Figure 4a). Since its size is smaller, it overlaps entirely with other categories of vehicles and the overlap values may exceed 100%. For example, if the leader is a heavy vehicle, the lateral overlap values are exceeding 200% "+a);
    }

    public void stop() {
Scanner sc = new Scanner(System.in);
     String a = sc.nextLine();
        System.out.println("~~BIKE DETAILS OF STOP~~");
        System.out.println(
                "feul consumption increases with an increase in idling engine speed (RPM), which leads to increase in the overall average emissions (e.g., NOx, VOCs, etc.) (Pekula et al., 2003). Typically, emission of NOx increases with increasing ambient temperature, depending on the type of vehicle and the idling speed. Fuel consumption and production of CO2 is proportional to engine load, which is directly to vehicle accessories power requirements. Accessory loading is determined by the actual accessories and their corresponding power requirements which is different for different loads. "+a);
    }
}

class car_rriding {

    public static void main(String[] args) {
        Vehicle a1 = new car1();
        a1.start();
        a1.stop();
        Vehicle a2 = new Motorcycle();
        a2.start();
        a2.stop();
    }
}