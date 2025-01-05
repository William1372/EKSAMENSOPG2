import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class BookingSystemTest {

    // Tester om man man kan over-booke et rum, der allerede er booket
    @Test
    void shouldReturnFalse(){

        BookingSystem bs = new BookingSystem();

        Room r1 = new Room(1,10);

        User u1 = new User(1,"William",31241414);

        LocalDateTime start = LocalDateTime.of(2025, 1, 1, 8, 0);
        LocalDateTime end = LocalDateTime.of(2025, 1, 1, 12, 0);
        bs.book(r1,start,end,u1);

        assertEquals(false,bs.isAvailable(r1,start,end));

    }

}