import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
        System.out.println("..................");
    }
}

public class Lib {

    public static void main(String[] args) {
        Book book1 = new Book("book1", "raju");
        Book book2 = new Book("book2", "shyam");
        Book book3 = new Book("book3", "vijay");

        Library lib1 = new Library("agra Library");
        Library lib2 = new Library("khandari Library");

        lib1.addBook(book1);
        lib1.addBook(book2);
        lib2.addBook(book3);

        lib1.displayBooks();
        lib2.displayBooks();
    }
}
