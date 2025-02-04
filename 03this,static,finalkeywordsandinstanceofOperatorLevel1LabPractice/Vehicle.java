
class Vehicle {
    private static double registrationFee = 50.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String registrationNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double fees) {
        registrationFee = fees;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("name of Owner " + ownerName);
            System.out.println("Registration Number is " + registrationNumber);
            System.out.println("Vehicle Type of owner is  " + vehicleType);
            System.out.println("Registration Fee is " + registrationFee);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Vehicle variable1 = new Vehicle("Arsh Singh", "India12", "bike");
        Vehicle variable2 = new Vehicle("Jay khan", "up801044", "car");

        variable1.displayVehicleDetails();
        variable2.displayVehicleDetails();

        updateRegistrationFee(20.0);

        variable1.displayVehicleDetails();
        variable2.displayVehicleDetails();
    }
}
