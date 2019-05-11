package pl.sda.rav.order;

import pl.sda.rav.User;
import pl.sda.rav.Vehicels;

public class Order {

    private static int id;
    Period period;
    Vehicels vehicels;
    User user;

    public Order() {
        id++;
    }
}
