import java.util.Scanner;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Speed is -> " + maxSpeed + "km/hr , fuel type is -> " + fuelType + " is!!");
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck speed -> " + maxSpeed + "km/hr , fuel -> " + fuelType + " , load carry -> "
                + loadCapacity + "kg is ???");
    }
}

class Motorcycle extends Vehicle {
    int average;

    public Motorcycle(int maxSpeed, String fuelType, int average) {
        super(maxSpeed, fuelType);
        this.average = average;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Bike speed - " + maxSpeed + "km/hr, fuel => " + fuelType + " , average " + average + "km/l is!!!");
    }
}

class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car speed => " + maxSpeed + "km/hr, fuel => " + fuelType + ", seat -> " + seatCapacity
                + " ppl is!!!!");
    }
}

public class VehicleM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] v = new Vehicle[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Which vehicle? (Car/Truck/Bike) --> tell fast is!!");
            String type = sc.next();

            if (type.equalsIgnoreCase("Car")) {
                System.out.println("Speed of car? ---> enter now!!!");
                int speed = sc.nextInt();
                System.out.println("Seat in car?--> how many ???");
                int seatCapacity = sc.nextInt();
                System.out.println("Fuel type?--> say is!!");
                String fueltype = sc.next();
                v[i] = new Car(speed, fueltype, seatCapacity);
            } else if (type.equalsIgnoreCase("Truck")) {
                System.out.println("Speed of truck?-> enter fast");
                int speed = sc.nextInt();
                System.out.println("Load carry?--> kg??");
                int loadCapacity = sc.nextInt();
                System.out.println("Fuel?? type??");
                String fueltype = sc.next();
                v[i] = new Truck(speed, fueltype, loadCapacity);
            } else if (type.equalsIgnoreCase("Bike")) {
                System.out.println("Bike speed? -> fast tell");
                int speed = sc.nextInt();
                System.out.println("Average?? (km/l) tell!!");
                int average = sc.nextInt();
                System.out.println("Fuel -> sayy quickly");
                String fueltype = sc.next();
                v[i] = new Motorcycle(speed, fueltype, average);
            } else {
                System.out.println("Wrong!!! Enter again -> fast fast!!");
                i--; // so user can enter again
            }
        }

        System.out.println("\n--- Vehicle Details ---");
        for (Vehicle vc : v) {
            vc.displayInfo();
        }
    }
}
