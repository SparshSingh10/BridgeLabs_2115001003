class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;

    public TicketNode(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private TicketNode head;
    private TicketNode tail;
    private int totalTickets;

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
        this.totalTickets = 0;
    }

    public void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        totalTickets++;
        System.out.println("Ticket added: " + customerName + " (Ticket ID: " + ticketId + ")");
    }

    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode current = head;

        // Check if head needs to be removed
        if (head.ticketId == ticketId) {
            if (head == tail) { // Only one ticket in the system
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            totalTickets--;
            System.out.println("Ticket removed: (Ticket ID: " + ticketId + ")");
            return;
        }

        // Traverse the list to find the ticket to remove
        while (current.next != head) {
            if (current.next.ticketId == ticketId) {
                if (current.next == tail) { // If removing the tail
                    tail = current;
                }
                current.next = current.next.next;
                totalTickets--;
                System.out.println("Ticket removed: (Ticket ID: " + ticketId + ")");
                return;
            }
            current = current.next;
        }

        System.out.println("Ticket not found with ID: " + ticketId);
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode current = head;
        System.out.println("Current Tickets:");
        while (true) {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: "
                    + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
            if (current == head) {
                break;
            }
        }
    }

    public void searchByCustomerName(String customerName) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode current = head;
        boolean found = false;
        System.out.println("Tickets for customer \"" + customerName + "\":");

        while (true) {
            if (current.customerName.equals(customerName)) {
                System.out.println("Ticket ID: " + current.ticketId + ", Movie: " + current.movieName + ", Seat: "
                        + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
            if (current == head) {
                break;
            }
        }

        if (!found) {
            System.out.println("No tickets found for this customer.");
        }
    }

    public void searchByMovieName(String movieName) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode current = head;
        boolean found = false;
        System.out.println("Tickets for movie \"" + movieName + "\":");

        while (true) {
            if (current.movieName.equals(movieName)) {
                System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Seat: "
                        + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
            if (current == head) {
                break;
            }
        }

        if (!found) {
            System.out.println("No tickets found for this movie.");
        }
    }

    public int getTotalTickets() {
        return totalTickets;
    }
}

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Alice", "Inception", 5, "10:00 AM");
        system.addTicket(102, "Bob", "Interstellar", 12, "12:30 PM");
        system.addTicket(103, "Charlie", "Inception", 8, "3:00 PM");
        system.displayTickets();
        system.searchByCustomerName("Alice");
        system.searchByMovieName("Inception");
        system.removeTicket(102);
        system.removeTicket(101);
        system.removeTicket(103);
        System.out.println("-------------------------");
        system.displayTickets();
        System.out.println("Total tickets booked: " + system.getTotalTickets());
    }
}
