import java.time.LocalDate;

class Ordr {
    protected String orderId;
    protected LocalDate orderDate;

    public Ordr(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return "Ordr Placed";
    }

    public void displayStatus() {
        System.out.println(getStatus());
    }
}

class ShipdOrdr extends Ordr {
    protected String trackNo;

    public ShipdOrdr(String orderId, LocalDate orderDate, String trackNo) {
        super(orderId, orderDate);
        this.trackNo = trackNo;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + " | Shipped with tracking No: " + trackNo;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println(getStatus());
    }
}

class DlvrOrdr extends ShipdOrdr {
    private LocalDate deliveryDate;

    public DlvrOrdr(String orderId, LocalDate orderDate, String trackNo, LocalDate deliveryDate) {
        super(orderId, orderDate, trackNo);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + " | Delivered on: " + deliveryDate;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println(getStatus());
    }
}

public class RetailMngmt {
    public static void main(String[] args) {
        Ordr ord = new Ordr("O1001", LocalDate.of(2025, 2, 7));
        ShipdOrdr shipdOrdr = new ShipdOrdr("O1002", LocalDate.of(2025, 2, 6), "TRK12345");
        DlvrOrdr dlvrOrdr = new DlvrOrdr("O1003", LocalDate.of(2025, 2, 5), "TRK67890", LocalDate.of(2025, 2, 7));

        System.out.println("--- Order Stat ---");
        ord.displayStatus();

        System.out.println("\n--- Shipd Ordr Stat ---");
        shipdOrdr.displayStatus();

        System.out.println("\n--- Dlvr Ordr Stat ---");
        dlvrOrdr.displayStatus();
    }
}
