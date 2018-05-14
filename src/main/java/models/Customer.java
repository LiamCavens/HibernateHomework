package models;

public class Customer {

    private String firstName;
    private String lastName;
    private int orderNumber;
    private int id;

    public Customer(String firstName, String lastName, int orderNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderNumber = orderNumber;
        this.id = id;
    }

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
