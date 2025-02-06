import java.util.ArrayList;
import java.util.List;

class Item {
    private String itemName;
    private double itemPrice;

    public Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}

class Purchase {
    private int purchaseId;
    private Buyer buyer;
    private List<Item> items;

    public Purchase(int purchaseId, Buyer buyer) {
        this.purchaseId = purchaseId;
        this.buyer = buyer;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showPurchaseDetails() {
        System.out.println("Purchase ID " + purchaseId + " made by " + buyer.getBuyerName());
        System.out.println("Items in this purchase");
        double totalCost = 0;
        for (Item item : items) {
            System.out.println("  - " + item.getItemName() + " (₹" + item.getItemPrice() + ")");
            totalCost += item.getItemPrice();
        }
        System.out.println("Total Cost ₹" + totalCost);
    }
}

class Buyer {
    private String buyerName;
    private List<Purchase> purchases;

    public Buyer(String buyerName) {
        this.buyerName = buyerName;
        this.purchases = new ArrayList<>();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void makePurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    public void showPurchases() {
        System.out.println(buyerName + "'s Purchases");
        for (Purchase purchase : purchases) {
            purchase.showPurchaseDetails();
            System.out.println();
        }
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 70000.00);
        Item item2 = new Item("Smartphone", 40000.00);
        Item item3 = new Item("Earbuds", 2500.00);

    
        Buyer buyer1 = new Buyer("Amit");
        Buyer buyer2 = new Buyer("Ravi");

 
        Purchase purchase1 = new Purchase(101, buyer1);
        purchase1.addItem(item1);
        purchase1.addItem(item2);
        buyer1.makePurchase(purchase1);

        Purchase purchase2 = new Purchase(102, buyer2);
        purchase2.addItem(item3);
        buyer2.makePurchase(purchase2);

        System.out.println();
        buyer1.showPurchases();
        buyer2.showPurchases();
    }
}
