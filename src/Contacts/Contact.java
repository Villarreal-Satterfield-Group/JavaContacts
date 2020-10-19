package Contacts;

public class Contact {
    private int id;
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber, int count) {
        this.id = count;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public int getId(){ return this.id; }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    public void  setId(int id){this.id = id; }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
