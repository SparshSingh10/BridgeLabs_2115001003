// package Vrs;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private int vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(int vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }

    public abstract double calculateRentalCost(int days);

}

interface Insurable {
    double calculateInsurance();

    void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private double inssuranceAmount;

    public Car(int vehicleNumber, String type, double rentalRate, double inssuranceAmount) {
        super(vehicleNumber, type, rentalRate);
        this.inssuranceAmount = inssuranceAmount;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return inssuranceAmount * 0.1;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Amount: " + inssuranceAmount);
        System.out.println("Calculated Insurance : " + calculateInsurance());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        getInsuranceDetails();
    }

    public double getInssuranceAmount() {
        return inssuranceAmount;
    }

    public void setInssuranceAmount(double inssuranceAmount) {
        this.inssuranceAmount = inssuranceAmount;
    }

}

class Bike extends Vehicle implements Insurable {
    private double insuranceAmount;

    public Bike(int vehicleNumber, String type, double rentalRate, double insuranceAmount) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public double calculateInsurance() {
        return .1 * insuranceAmount;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Amount: " + insuranceAmount);
        System.out.println("Calculated Insurance : " + calculateInsurance());
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        getInsuranceDetails();
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

class Truck extends Vehicle implements Insurable {
    private double insuranceAmount;

    public Truck(int vehicleNumber, String type, double rentalRate, double insuranceAmount) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return .1 * insuranceAmount;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Amount : " + insuranceAmount);
        System.out.println("Calculated Insurance : " + calculateInsurance());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        getInsuranceDetails();
    }

}

public class Vrs {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car(1, "Car", 100, 500);
        car.displayDetails();
        System.out.println("rentail cost is " + car.calculateRentalCost(3));

    }

}