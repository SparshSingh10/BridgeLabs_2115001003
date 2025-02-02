class Book2 {

    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book2() {
        System.out.println("Default Constructor Called");
    }

    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (!isAvailable) {
            System.out.println("Book not Available, Return First !");
        } else {
            System.out.println("You have successfully borrowed Book !");
            isAvailable = false;
        }
    }

    public void returnBook() {
        if (isAvailable)
            System.out.println("Borrow First, than return !");
        else {
            System.out.println("Returned the book successfully");
            isAvailable = true;
        }
    }

    // setter not needed as nothing change in values
    // public void setTitle(String title) {
    // this.title = title;
    // }

    // public void setAuthor(String author) {
    // this.author = author;
    // }

    // public void setPrice(double price) {
    // this.price = price;
    // }

}