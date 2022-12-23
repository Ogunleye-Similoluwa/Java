package ChibuzorSnacks.CRUD;



public class Create {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private int id;


    public Create(int id ,String name, String phoneNumber, String address, String email) {
    this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
}

    public int getId() {
        return id;
    }
    }


