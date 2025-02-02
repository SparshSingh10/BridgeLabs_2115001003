public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking() {
        System.out.println("Default constructor called");
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking copy) {
        this.guestName = copy.guestName;
        this.roomType = copy.roomType;
        this.nights = copy.nights;
    }

    // getters
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // setters

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

}