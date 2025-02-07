class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title of the book is " + title);
        System.out.println("Publication year of the book is " + publicationYear);
    }
}

class Authr extends Book {
    String authorName;
    String biography;

    public Authr(String title, int publicationYear, String authorName, String biography) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.biography = biography;
    }

    @Override
    public void displayDetails() {
        System.out.println("Author's name is " + authorName);
        super.displayDetails();
        System.out.println("Biography of the book is " + biography);
    }

}

public class Libray {
    public static void main(String[] args) {
        Authr author = new Authr("Life Story", 2023, "Rahul Sharma", "A journey through life's ups and downs");
        author.displayDetails();
    }
}
