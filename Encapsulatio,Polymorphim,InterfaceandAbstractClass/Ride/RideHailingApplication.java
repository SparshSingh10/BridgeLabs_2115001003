abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails(){
        System.out.println("Vehicle ID is " + vehicleId);
        System.out.println("Driver Name is " + driverName);
        System.out.println("Rate per Km is " + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String locationCurrent;

    public Car(int vehicleId, String driverName, double ratePerKm, String locationCurrent) {
        super(vehicleId, driverName, ratePerKm);
        this.locationCurrent = locationCurrent;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return locationCurrent;
    }

    @Override
    public void updateLocation(String newLocation) {
        locationCurrent = newLocation;
    }

    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
        System.out.println("Current Location of Car: " + locationCurrent);
    }
}

class Bike extends Vehicle implements GPS {
    private String locationCurrent;

    public Bike(int vehicleId, String driverName, double ratePerKm, String locationCurrent) {
        super(vehicleId, driverName, ratePerKm);
        this.locationCurrent = locationCurrent;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return locationCurrent;
    }

    @Override
    public void updateLocation(String newLocation) {
        locationCurrent = newLocation;
    }

    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
        System.out.println("Current Location of Bike is" + locationCurrent);
    }
}

class Auto extends Vehicle implements GPS {
    private String locationCurrent;

    public Auto(int vehicleId, String driverName, double ratePerKm, String locationCurrent) {
        super(vehicleId, driverName, ratePerKm);
        this.locationCurrent = locationCurrent;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 10;
    }

    @Override
    public String getCurrentLocation() {
        return locationCurrent;
    }

    @Override
    public void updateLocation(String newLocation) {
        locationCurrent = newLocation;
    }

    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
        System.out.println("Current Location of Auto is " + locationCurrent);
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car(10, "sparsh singh", 12.5, "midtown");
        Vehicle bike = new Bike(10, "Karan ", 11.0, "Uptown");
        Vehicle auto = new Auto(10, "rahul", 14.0, "City Center");

        processRide(car, 10);
        processRide(bike, 5);
        processRide(auto, 8);
    }

    public static void processRide(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Total Fare for " + distance + " km is " + vehicle.calculateFare(distance));

        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println("Current Location is " + gpsVehicle.getCurrentLocation());
        }
        System.out.println();
    }

}