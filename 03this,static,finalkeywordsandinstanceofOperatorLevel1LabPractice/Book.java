class Book {
    private static String libraryName = "Main Library";
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name" + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library " + libraryName);
            System.out.println("Title " + title);
            System.out.println("Author " + author);
            System.out.println("ISBN " + isbn);
        } else {
            System.out.println("Invalid book.");
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();
        Book bk1 = new Book("Twilight", "kingston", "1147474177");
        Book bk2 = new Book("india", "hm singh", "987555227555");

        bk1.displayBookDetails();
        bk2.displayBookDetails();
    }
}
