import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addAtBeginning("Laptop", 101, 10, 1200.0);
        inventory.addAtEnd("Mouse", 102, 50, 25.0);
        inventory.addAtPosition("Keyboard", 103, 30, 50.0, 2);

        inventory.displayInventory();

        inventory.search("123");

        inventory.updateQuantity(101, 15);

        inventory.calculateTotalValue();

        inventory.sortByName(true);
        inventory.displayInventory();

        inventory.sortByPrice(true);
        inventory.displayInventory();
    }
}

class Node {
    String name;
    int itemId;
    int quantity;
    double price;

    public Node(String name, int itemId, int quantity, double price) {
        this.name = name;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = next;
    }

    Node next;
}

class Inventory {
    private Node head;
    Scanner sc = new Scanner(System.in);

    public Inventory() {
        this.head = head;
    }

    public void addAtBeginning(String name, int itemId, int quantity, double price) {
        Node obj = new Node(name, itemId, quantity, price);
        obj.next = head;
        head = obj;
    }

    public void addAtPosition(String name, int itemId, int quantity, double price, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(name, itemId, quantity, price);
            return;
        }
        Node obj = new Node(name, itemId, quantity, price);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
        } else {
            obj.next = temp.next;
            temp.next = obj;
            System.out.println("Item added at position " + position + ".");
        }
    }

    public void addAtEnd(String name, int itemId, int quantity, double price) {
        Node obj = new Node(name, itemId, quantity, price);
        if (head == null) {
            head = obj;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = obj;
        }
        System.out.println("Item added at the end.");
    }

    public void removeById(int itemId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item deleted.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item deleted.");
        }

    }

    public void updateQuantity(int itemId, int newQuantity) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated for item with ID " + itemId + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    public void search(String itemIdOrName) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == Integer.parseInt(itemIdOrName) || temp.name == itemIdOrName) {
                System.out.println("Item found: Item ID: " + temp.itemId + ", Name: " + temp.name + ", Quantity: "
                        + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID or Name " + itemIdOrName + " not found.");
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        Node temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total value of the inventory is: " + totalValue);
    }

    public void sortByName(boolean ascending) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        List<Node> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }
        if (ascending)
            list.sort((a, b) -> a.name.compareTo(b.name));
        else
            list.sort((a, b) -> b.name.compareTo(a.name));

        head = list.get(0);
        temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = list.get(i);
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Inventory sorted by Item Name (" + (ascending ? "ascending" : "descending") + ").");
    }

    public void sortByPrice(boolean ascending) {
        if (head == null || head.next == null) {
            System.out.println("Inventory is empty or has only one item.");
            return;
        }
        List<Node> items = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            items.add(temp);
            temp = temp.next;
        }
        if (ascending) {
            items.sort((a, b) -> Double.compare(a.price, b.price));
        } else {
            items.sort((a, b) -> Double.compare(b.price, a.price));
        }
        head = items.get(0);
        temp = head;
        for (int i = 1; i < items.size(); i++) {
            temp.next = items.get(i);
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Inventory sorted by Price (" + (ascending ? "ascending" : "descending") + ").");
    }

    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Node temp = head;
        System.out.println("Inventory Items:");
        while (temp != null) {
            System.out.println("ID: " + temp.itemId + ", Name: " + temp.name +
                    ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}
