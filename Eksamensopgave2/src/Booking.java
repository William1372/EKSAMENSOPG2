import java.time.LocalDateTime;

public class Booking {

    private Room room;
    private User user;
    private LocalDateTime start;
    private LocalDateTime end;

    public Booking(Room room, LocalDateTime start, LocalDateTime end, User user){

        this.room = room;
        this.start = start;
        this.end = end;
        this.user = user;

    }

    public Room getRoom(){

        return room;

    }

    public LocalDateTime getStart(){

        return start;

    }

    public LocalDateTime getEnd(){

        return end;

    }

    @Override
    public String toString(){

        return "Booking - "+"Værelse: "+room+", starttidspunkt: "+start+", sluttidspunkt: "+end+", gæst: "+user;

    }

}
