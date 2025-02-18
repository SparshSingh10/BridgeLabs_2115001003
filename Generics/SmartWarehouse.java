import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}

class Electronics extends WarehouseItem {
    private String brandName;

    public Electronics(String name, String brandName) {
        super(name);
        this.brandName = brandName;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics " + getName() + " | brandName" + brandName);
    }
}

class Groceries extends WarehouseItem {
    private String endExpiry;

    public Groceries(String name, String endExpiry) {
        super(name);
        this.endExpiry = endExpiry;
    }

    @Override
    public void displayDetails() {
        System.out.println("Grocery " + getName() + " | Expiry Date " + endExpiry);
    }
}

class Furniture extends WarehouseItem {
    private String materialType;

    public Furniture(String name, String materialType) {
        super(name);
        this.materialType = materialType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture " + getName() + " | materialType " + materialType);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtility {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> eS = new Storage<>();
        eS.addItem(new Electronics("Laptop", "Asus"));
        eS.addItem(new Electronics("phone", "mi"));

        Storage<Groceries> gStorage = new Storage<>();
        gStorage.addItem(new Groceries("Milk", "2026-01-01"));
        gStorage.addItem(new Groceries("Apple", "2024-11-14"));

        Storage<Furniture> furn = new Storage<>();
        furn.addItem(new Furniture("Chair", "Wood"));
        furn.addItem(new Furniture("Table", "Metal"));

        System.out.println("Electronics");
        WarehouseUtility.displayAllItems(eS.getItems());

        System.out.println("Groceries");
        WarehouseUtility.displayAllItems(gStorage.getItems());

        System.out.println("Furniture");
        WarehouseUtility.displayAllItems(furn.getItems());
    }
}
