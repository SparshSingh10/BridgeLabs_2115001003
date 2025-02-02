// package assignment2.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Sparsh", "Bike");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(1000);

        System.out.println("After updating registration fee is\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
