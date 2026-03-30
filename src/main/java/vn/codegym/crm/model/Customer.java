package vn.codegym.crm.model;

public class Customer {
    private int id;
    private String fullname;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int id, String fullname, String email, String address) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
