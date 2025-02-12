import java.util.Scanner;

// Node representing a text state
class TextState {
    String text;
    TextState prev, next;

    public TextState(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

// Doubly Linked List for Undo/Redo
class TextEditor {
    private TextState head = null, tail = null, current = null;
    private int size = 0, maxSize = 10;

    // Add new text state (Perform Action)
    public void addState(String newText) {
        TextState newState = new TextState(newText);

        // If list is empty, initialize head and tail
        if (head == null) {
            head = tail = current = newState;
        } else {
            // Remove all forward history (redo)
            current.next = null;

            // Add new state at the end
            newState.prev = current;
            current.next = newState;
            current = newState;

            // Maintain size limit (remove oldest state if needed)
            size++;
            if (size > maxSize) {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        displayCurrentState();
    }

    // Undo Functionality
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            displayCurrentState();
        } else {
            System.out.println("❌ Cannot Undo (No previous state available)");
        }
    }

    // Redo Functionality
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            displayCurrentState();
        } else {
            System.out.println("❌ Cannot Redo (No forward state available)");
        }
    }

    public void displayCurrentState() {
        System.out.println("\n📜 Current Text: " + (current != null ? current.text : "Empty"));
    }
}

public class UndoRedoEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Type (Add new text)");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter new text: ");
                    String text = scanner.nextLine();
                    editor.addState(text);
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    editor.redo();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
