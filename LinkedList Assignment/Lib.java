
public class Lib {

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addAtEnd("Book2", "raj", "comedy", 101, false);
        lib.addAtEnd("Book2", "raj", "comedy", 101, false);
        lib.addAtBeginning("The world", "Arsh", "action", 123, true);
        lib.addAtPosition("broo", "rahul", "thriller", 102, false, 4);
        lib.displayForward();

    }
}

class Node {
    String title;
    String author;
    String genre;
    int id;
    boolean isAvailable;
    Node prev, next;

    public Node(String title, String author, String genre, int id, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }

}

class Library {
    private Node head, tail;
    private int count = 0;

    public Library() {
        this.head = null;
        this.tail = null;
    }

    public void addAtBeginning(String title, String author, String genre, int id, boolean isAvailable) {
        Node obj = new Node(title, author, genre, id, isAvailable);

        if (head == null)
            head = tail = obj;
        else {
            obj.next = head;
            head.prev = obj;
            head = obj;
        }
        count++;

    }

    public void addAtEnd(String title, String author, String genre, int id, boolean isAvailable) {
        Node obj = new Node(title, author, genre, id, isAvailable);
        if (tail == null) {
            head = tail = obj;

        } else {
            tail.next = obj;
            obj.prev = tail;
            tail = obj;
        }
        count++;
    }

    public void addAtPosition(String title, String author, String genre, int id, boolean isAvailable, int pos) {
        if (pos <= 1) {
            addAtBeginning(title, author, genre, id, isAvailable);
        }
        if (pos > count) {
            addAtEnd(title, author, genre, id, isAvailable);
        }
        Node obj = new Node(title, author, genre, id, isAvailable);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        obj.next = temp.next;
        obj.prev = temp;
        temp.next.prev = obj;
        temp.next = obj;
        count++;
    }

    public void search(String titleOrAuthor) {

        Node temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(titleOrAuthor) || temp.author.equalsIgnoreCase(titleOrAuthor)) {
                System.out.println("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found");
    }

    public void remove(int id) {
        Node temp = head;
        if (head == null)
            System.out.println("List is Empty");

        while (temp != null && temp.id != id) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Not Found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null)
                head.prev = null;

        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        count--;
        System.out.println("Removed");

    }

    public void update(int id, boolean isAvailable) {
        Node temp = head;
        while (temp != null && temp.id != id) {
            temp = temp.next;
        }
        if (temp == null)
            System.out.println("Not Found");
        else {
            temp.isAvailable = isAvailable;
            System.out.println("Updated");
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node temp = head;
        System.out.println("Books in Library (Forward Order):");
        while (temp != null) {
            System.out.println(temp.id + " - " + temp.title + " by " + temp.author + " | Genre: " + temp.genre
                    + " | Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

}
