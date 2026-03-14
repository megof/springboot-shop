package models;

public class User {
    private String Name;
    private String Lastname;
    private int Count;
    
    public User(String name, String lastname, int count) {
        Name = name;
        Lastname = lastname;
        Count = count;
    }
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public int getCount() {
        return Count;
    }
    public void setCount(int count) {
        Count = count;
    }

    
}
