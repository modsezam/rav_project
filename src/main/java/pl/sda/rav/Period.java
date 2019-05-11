package pl.sda.rav;

import java.time.LocalDate;

public class Period {
    private LocalDate startDate;
    private LocalDate endDate;

    public Period(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isAvailability (LocalDate startDate, LocalDate endDate){

        boolean result = false;

        if (startDate.isBefore(this.startDate) && endDate.isBefore(this.startDate)){
            result = true;
        }

        if (startDate.isAfter(this.endDate) && endDate.isAfter(this.endDate)){
            result = true;
        }

        return result;
    }



}
