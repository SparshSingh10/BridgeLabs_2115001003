public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double rate = 50.0;

    public CarRental() {
        System.out.println("Default Constructor");
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double cost() {
        System.out.println("Rate per day is 50");
        return rentalDays * rate;
    }

    public void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + cost());
    }

}
