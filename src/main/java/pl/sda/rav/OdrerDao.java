package pl.sda.rav;

import java.time.LocalDate;
import java.util.ArrayList;

public class OdrerDao {

    ArrayList<Order> orders = new ArrayList<>();

    public boolean isAvailability(String vin, LocalDate startDate, LocalDate endTime){
        boolean result = false;

        for (Order order : orders) {
            if (order.period.isAvailability(startDate, endTime) == true){
                result = true;
            }
        }

        return result;
    }



}
