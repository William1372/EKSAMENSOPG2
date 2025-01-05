import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {

    private List<Room> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public boolean isAvailable(Room room, LocalDateTime start, LocalDateTime end){

        for(Booking booking : bookings){

            if(booking.getRoom().equals(room) &&
                    booking.getStart().isBefore(end) &&
                    booking.getEnd().isAfter(start)){

                return false;

            }

        }

        return true;

    }

    public List<Room> findAvailable(int capacity, LocalDateTime start, LocalDateTime end){

        List<Room> availableRooms = new ArrayList<>();
        for(Room room : rooms){

            if(room.getCapacity() >= capacity && isAvailable(room, start, end)){

                availableRooms.add(room);
                System.out.println(room);

            }

        }

        return availableRooms;

    }

    public Booking book(Room room, LocalDateTime start, LocalDateTime end, User user){

        if(isAvailable(room, start, end)){

            Booking newBooking = new Booking(room, start, end, user);
            bookings.add(newBooking);
            System.out.println("Booking af værelse: "+room.getRoomId()+" er nu oprettet!");
            System.out.println("Check ind: "+start);
            System.out.println("Check ud: "+end);
            return newBooking;

        }

        System.out.println("Værelset er desværre ikke frit på det pågældende tidspunkt...");
        return null;

    }

    public void cancel(Booking newBooking){

        bookings.remove(newBooking);

    }

    public void addRoom(Room room){

        rooms.add(room);

    }

}
