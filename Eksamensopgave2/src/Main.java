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

        LocalDateTime start = LocalDateTime.of(2025, 1, 6, 9, 30);
        LocalDateTime end = LocalDateTime.of(2025, 1, 6, 10, 0);
        System.out.println("Værelse 3 er ledigt: " + bS.isAvailable(r1, start, end));

        // Test
        Booking b1 = bS.book(r1, start, end, u1);
        if (b1 != null) {

            System.out.println("Booking lavet for værelse 1 af: " + u1.getName());

        } else {

            System.out.println("Værelse 1 er desværre ikke ledigt...");

        }

        // Test 2
        Booking b2 = bS.book(r1, start, end, u2);
        if (b2 != null) {

            System.out.println("Booking lavet for værelse 1 af: " + u1.getName());

        } else {

            System.out.println("Værelse 1 er desværre ikke ledigt...");

        }

        // Test 3
        LocalDateTime start2 = LocalDateTime.of(2025,1,6,12,0);
        LocalDateTime end2 = LocalDateTime.of(2025,1,6,14,0);
        System.out.println("Tilgængelige værelser: "+bS.findAvailable(9,start2,end2));

        // Test 4
        bS.cancel(b1);
        System.out.println("Værelse 1 reservation er annulleret!");
        System.out.println("Værelse 1 er tilgængeligt: "+bS.isAvailable(r1, start2, end2));

    }
}
