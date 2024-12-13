package Hotel;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private List<Customer> customer;

    public Customer(int customerId, String name, List<Room> rooms) {
        this.customerId = customerId;
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getRooms() {
        return customer;
    }

    public void setRooms(List<Customer> rooms) {
        this.customer = customer;
    }
}
