package pl.sda.rav.order;

import java.time.LocalDate;

public class Period {
    private LocalDate startDate;
    private LocalDate endDate;

    public Period(LocalDate startDate, LocalDate endDate) {
        if(endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("end date must be before start date!");
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isContains (LocalDate startDate, LocalDate endDate){
        if (endDate.isBefore(this.startDate)){
            return true;
        }

        return startDate.isAfter(this.endDate);
    }
}
