public class User {

    private int userId;
    private String name;
    private int phoneNumber;

    public User(int userId, String name, int phoneNumber){

        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public int getUserId(){

        return userId;

    }

    public String getName(){

        return name;

    }

    public int getPhoneNumber(){

        return phoneNumber;

    }

    @Override
    public String toString(){

        return "Gæst: "+name+", kundeID: "+userId+", tlf. nr.: "+phoneNumber;

    }

}
