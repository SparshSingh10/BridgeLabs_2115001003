// Parent class
class Book3 {
    public int ISBN;
    protected String title ;
    private String author;

    public Book3(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public Book3() {
        System.out.println("Parent default Constructor");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBOOK extends Book3 {

    public EBOOK(int ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {

        System.out.println("E-Book Details:");
        System.out.println("ISBN (from parent): " + super.ISBN);
        System.out.println("Title (from parent): " + super.title);
        System.out.println("Author (from parent): " + getAuthor());
    }
}
