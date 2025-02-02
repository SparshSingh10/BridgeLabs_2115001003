public class Product {

    private String productName;
    private double price;
    private static int count = 0;

    public Product() {
        System.out.println("Default Constructor");
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        count++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name : " + productName + "\nProduct Price : " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Product = " + count);
    }

}
