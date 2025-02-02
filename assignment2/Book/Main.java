public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Starry Night\n", "Neil de Tyson\n", 100);
        System.out.println(book1.getTitle() + book1.getAuthor() + book1.getPrice());

    }

}
