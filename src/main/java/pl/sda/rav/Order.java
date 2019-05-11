package pl.sda.rav;

import java.time.LocalDate;

public class Order {

    private static int id;
    Period period;
    Vehicels vehicels;
    User user;

    public Order() {
        id++;
    }
}
