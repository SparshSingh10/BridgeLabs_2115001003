class Product {
    private static double discount = 10.0;
    private final int productID;
    private String name;
    private double cost;
    private int quantity;

    public Product(int productID, String name, double cost, int quantity) {
        this.productID = productID;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID " + productID);
            System.out.println("Product Name " + name);
            System.out.println("cost " + cost);
            System.out.println("Quantity " + quantity);
            System.out.println("Discount " + discount + "%");
        } else {
            System.out.println("Invalid product");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "bread", 500, 3);
        Product product2 = new Product(102, "milk", 200, 1);

        product1.displayProductDetails();
        product2.displayProductDetails();

        updateDiscount(25.0);

        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}