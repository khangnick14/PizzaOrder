package rmit.ad.pizzaorder;

import java.util.ArrayList;

public class Pizza {
    private String size, crust, meat;
    private ArrayList<String> topping;
    private double price;

    Pizza() {
    }

    Pizza(String size, String crust, String meat, ArrayList<String> topping, double price) {
        this.size = size;
        this.crust = crust;
        this.meat = meat;
        this.topping = topping;
        this.price = price;
    }

    public double calculatePrice(Pizza pizza) {
        double totalPrice = 0;

        switch (pizza.getSize()) {
            case "S":
                totalPrice += 6.0;
                break;
            case "M":
                totalPrice += 7.0;
                break;
            case "L":
                totalPrice += 8.0;
                break;
            default:
                totalPrice += 8.5;
                break;
        }

        switch (pizza.getMeat()) {
            case "Chicken":
                totalPrice += 2.5;
                break;
            case "Beef":
                totalPrice += 3.0;
                break;
            case "Seafood":
                totalPrice += 3.5;
                break;
            default:
                totalPrice += 2.0;
                break;
        }

        if (pizza.getTopping().size() > 3) {
            totalPrice += 1.5;
        }
        return totalPrice;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<String> getTopping() {
        return topping;
    }

    public String getCrust() {
        return crust;
    }

    public String getMeat() {
        return meat;
    }

    public String getSize() {
        return size;
    }
}

