import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Id: " + productId);
        System.out.println("Price: " + price);
    }
}

interface Taxable {
    double calculateTax();

    void getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discount;

    public Electronics(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discount / 100);
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on Product " + getName() + " is: " + calculateTax());
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void displayDetails() {
        super.displayDetails();
        double discountedPrice = calculateDiscount();
        double tax = calculateTax();
        double finalPrice = getPrice() - discountedPrice + tax;
        System.out.println("Discounted Price: " + discountedPrice);
        System.out.println("Tax on Product: " + tax);
        System.out.println("Final Price (after discount and tax): " + finalPrice);
        System.out.println();
    }
}

class Clothing extends Product implements Taxable {
    private double discount;

    public Clothing(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discount / 100);
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on Product " + getName() + " is: " + calculateTax());
    }

    public void displayDetails() {
        super.displayDetails();
        double discountedPrice = calculateDiscount();
        double tax = calculateTax();
        double finalPrice = getPrice() - discountedPrice + tax;
        System.out.println("Discounted Price: " + discountedPrice);
        System.out.println("Tax on Product: " + tax);
        System.out.println("Final Price (after discount and tax): " + finalPrice);
        System.out.println();
    }
}

class Groceries extends Product implements Taxable {
    private double discount;

    public Groceries(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discount / 100); // Discount for groceries
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on Product " + getName() + " is: " + calculateTax());
    }

    public void displayDetails() {
        super.displayDetails();
        double discountedPrice = calculateDiscount();
        double tax = calculateTax();
        double finalPrice = getPrice() - discountedPrice + tax;
        System.out.println("Discounted Price: " + discountedPrice);
        System.out.println("Tax on Product: " + tax);
        System.out.println("Final Price (after discount and tax): " + finalPrice);
        System.out.println();
    }
}

public class Ecm {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000, 5));
        products.add(new Clothing(201, "T-Shirt", 1500, 10));
        products.add(new Groceries(301, "Rice", 1000, 50));

        System.out.println("Final Prices of Products:");

        for (Product prod : products) {
            prod.displayDetails();

            ((Taxable) prod).getTaxDetails();

            System.out.println("**************************");
        }
    }
}
