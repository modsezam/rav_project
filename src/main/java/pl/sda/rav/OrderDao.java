package pl.sda.rav;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrderDao {

    ArrayList<Order> orders = new ArrayList<>();

    public boolean isAvailability(String vin, LocalDate startDate, LocalDate endTime){
        boolean result = false;

        for (Order order : orders) {
            if (order.vehicels.getVin().equals(vin)){
                if (!order.period.isAvailability(startDate, endTime)){
                    result = true;
                }
            }
        }

        return result;
    }



}
