package pl.sda.rav.order;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrderDao {

    ArrayList<Order> orders = new ArrayList<>();

    public boolean isAvailability(String vin, LocalDate startDate, LocalDate endTime){

        for (Order order : orders) {
            if (order.vehicels.getVin().equals(vin)){
                if (!order.period.isContains(startDate, endTime)){
                    return false;
                }
            }
        }

        return true;
    }



}
