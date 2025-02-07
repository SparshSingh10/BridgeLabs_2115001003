class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model is " + model + " max speed is " + maxSpeed + "km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charge vehicle now...");
    }

    public void displayVehicleType() {
        System.out.println("It is Electric Vehicle");
        super.displayDetails();
        System.out.println("Battery is " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle refuel now...");
    }

    public void displayVehicleType() {
        System.out.println("It is Petrol Vehicle");
        super.displayDetails();
        System.out.println("Fuel is " + fuelCapacity + " liters");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 240, 60);

        System.out.println("--- Electric Vehicle Details ---");
        ev.displayVehicleType();
        ev.charge();

        System.out.println("\n--- Petrol Vehicle Details ---");
        pv.displayVehicleType();
        pv.refuel();
    }
}
