package rmit.ad.pizzaorder;

import java.util.Queue;

public class Customer {
    private String name, address, phoneNumber;
    Queue<Pizza> orderList;

    Customer() {
    }

    Customer(String name, String address, String phoneNumber, Queue<Pizza> orderList) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}



