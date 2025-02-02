
public class Main {
    public static void main(String[] args) {
        Book2 book1 = new Book2("The Starry Night\n", "Neil de Tyson\n", 100);
        book1.borrow();
        book1.borrow();

        book1.returnBook();
        book1.returnBook();
    }
}
