public class User {

    private int userId;
    private String name;
    private int phoneNumber;

    public User(int userId, String name, int phoneNumber){

        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public String getName(){

        return name;

    }

    @Override
    public String toString(){

        return "Gæst: "+name+", kundeID: "+userId+", tlf. nr.: "+phoneNumber;

    }

}
