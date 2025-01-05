import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        BookingSystem bS = new BookingSystem();

        Room r1 = new Room(1, 4);
        Room r2 = new Room(2, 6);
        Room r3 = new Room(3, 8);
        Room r4 = new Room(4, 8);
        Room r5 = new Room(5, 20);

        bS.addRoom(r1);
        bS.addRoom(r2);
        bS.addRoom(r3);
        bS.addRoom(r4);
        bS.addRoom(r5);

        User u1 = new User(1, "William", 39181209);
        User u2 = new User(2, "Benedicte", 49481214);

        bS.findAvailable(4,LocalDateTime.of(2025,01,01,18,30),LocalDateTime.of(2025,01,03,10,00));

        Booking booking = bS.book(r1,LocalDateTime.of(2025,01,01,18,30),LocalDateTime.of(2025,01,03,10,00),u1);

        // Test for at se om et booket værelse bliver booket når det bookes
        // bS.findAvailable(4,LocalDateTime.of(2025,01,01,19,30),LocalDateTime.of(2025,01,03,10,00));

        // Test for at se om fejlbesked fungerer mht. overbooking
        // bS.book(r1,LocalDateTime.of(2025,01,01,20,30),LocalDateTime.of(2025,01,03,10,00),u2);

        // Test for at se om den er tilgængelig efter at blive aflyst
        bS.cancel(booking);

        bS.findAvailable(4,LocalDateTime.of(2025,01,01,18,30),LocalDateTime.of(2025,01,03,10,00));


    }
}
