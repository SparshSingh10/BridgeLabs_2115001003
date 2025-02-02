public class Main {
    public static void main(String[] args) {
        HotelBooking room1 = new HotelBooking("Rahul", "general", 1);
        HotelBooking room2 = new HotelBooking(room1);

        System.out.println(room1.getGuestName() + room1.getNights());
        System.out.println("copy constructor is -> " + room2.getGuestName() + room2.getNights());

    }
}
