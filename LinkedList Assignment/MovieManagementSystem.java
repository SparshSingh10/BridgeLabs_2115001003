
class Node {
    String title;
    String director;
    int year;
    double rating;
    Node next;
    Node prev;

    // Constructor
    public Node(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieList {
    private Node head;
    private Node tail;

    // Constructor
    public MovieList() {
        this.head = null;
        this.tail = null;
    }

    // Add a movie at the beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Node obj = new Node(title, director, year, rating);
        if (head == null) {
            head = tail = obj;
        } else {
            obj.next = head;
            head.prev = obj;
            head = obj;
        }
        System.out.println("Movie added at the beginning: " + title);
    }

    // Add a movie at the end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Node obj = new Node(title, director, year, rating);
        if (tail == null) {
            head = tail = obj;
        } else {
            obj.prev = tail;
            tail.next = obj;
            tail = obj;
        }
        System.out.println("Movie added at the end: " + title);
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        Node obj = new Node(title, director, year, rating);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        obj.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = obj;
        } else {
            tail = obj;
        }
        temp.next = obj;
        obj.prev = temp;
        System.out.println("Movie added at position " + position + ": " + title);
    }

    // Remove a movie by title
    public void removeMovieByTitle(String word) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(word)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                System.out.println("Movie removed: " + word);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found: " + word);
    }

    // Search for movies by director
    public void searchByDirector(String director) {
        Node temp = head;
        boolean found = false;
        System.out.println("Movies by director " + director + ":");
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println(temp.title + " (" + temp.year + ") - Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found by this director.");
        }

    }

    // Search for movies by rating
    public void searchByRating(double minRating) {
        Node temp = head;
        boolean found = false;
        System.out.println("Movies with rating >= " + minRating + ":");
        while (temp != null) {
            if (temp.rating >= minRating) {
                System.out.println(temp.title + " (" + temp.year + ") - Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with this rating.");
        }
    }

    // Display all movies in forward order
    public void displayForward() {
        Node current = head;
        System.out.println("Movies in forward order:");
        while (current != null) {
            System.out.println(current.title + " (" + current.year + ") - Directed by: " + current.director
                    + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        Node current = tail;
        System.out.println("Movies in reverse order ");
        while (current != null) {
            System.out.println(current.title + " (" + current.year + ") - Directed by: " + current.director
                    + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Update a movie's rating by title
    public void updateRating(String title, double newRating) {
        Node current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for " + title + ": " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();

        // Adding movies
        movieList.addMovieAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addMovieAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movieList.addMovieAtPosition("Interstellar", "Christopher Nolan", 2014, 8.6, 2);

        // Display movies
        movieList.displayForward();
        movieList.displayReverse();

        // Search movies
        movieList.searchByDirector("Christopher Nolan");
        movieList.searchByRating(9.0);

        // Update rating
        movieList.updateRating("Inception", 9.0);

        // Remove movie
        movieList.removeMovieByTitle("Interstellar");

        // Display movies after removal
        movieList.displayForward();
    }
}
