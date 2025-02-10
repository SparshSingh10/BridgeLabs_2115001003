import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private double price;
    private String itemName;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Food Item Name is  " + itemName);
        System.out.println("Food Item Quantity is  " + quantity);
        System.out.println("Food Item Price is  " + price);
    }
}

interface Discountable {
    double applyDiscount(double discountPer);

    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discountPer;

    public VegItem(String itemName, double price, int quantity, double discountPer) {
        super(itemName, price, quantity);
        this.discountPer = discountPer;
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice + (basePrice * 12 / 100);
    }

    @Override
    public double applyDiscount(double discountPer) {
        double discountAmount = calculateTotalPrice() * (discountPer / 100);
        return discountAmount;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount on Veg Items : " + applyDiscount(discountPer));
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        double finalPrice = calculateTotalPrice() - applyDiscount(discountPer);
        System.out.println("Veg Food Item Price incuding taxes and discount : " + finalPrice);

    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discountPer;
    private double NON_VEG_EXTRA_CHARGE = 40;

    public NonVegItem(String itemName, double price, int quantity, double discountPer) {
        super(itemName, price, quantity);
        this.discountPer = discountPer;
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice + (basePrice * 18 / 100) + this.NON_VEG_EXTRA_CHARGE;
    }

    @Override
    public double applyDiscount(double discountPer) {
        double discountAmount = calculateTotalPrice() * (discountPer / 100);
        return discountAmount;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount on NonVeg Items is" + applyDiscount(discountPer));
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        double finalPrice = calculateTotalPrice() - applyDiscount(discountPer);
        System.out.println("NonVeg Food Item Price incuding taxes and discount is " + finalPrice);

    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        VegItem vegBiryani = new VegItem("Veg Biryani", 250.0, 2, 10);
        VegItem paneerButterMasala = new VegItem("Paneer Butter Masala", 320.0, 1, 12);
        NonVegItem chickenCurry = new NonVegItem("Chicken Curry", 400.0, 1, 15);
        NonVegItem fishFry = new NonVegItem("Fish Fry", 350.0, 2, 10);

        List<FoodItem> fc = new ArrayList<>();
        fc.add(vegBiryani);
        fc.add(paneerButterMasala);
        fc.add(chickenCurry);
        fc.add(fishFry);

        System.out.println("Order Summary");
        for (FoodItem item : fc) {
            item.getItemDetails();
            System.out.println("*****************************");
        }
    }
}
