public class Room {

    private int roomId;
    private int capacity;

    public Room(int roomId, int capacity){

        this.roomId = roomId;
        this.capacity = capacity;

    }

    public int getCapacity(){

        return capacity;

    }

    public int getRoomId(){

        return roomId;

    }

    @Override
    public String toString(){

        return "Værelse ID: "+roomId+", kapacitet: "+capacity;

    }

}