package pl.sda.rav.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.rav.order.Period;

import java.time.LocalDate;

class PeriodTest {

    @Test
    void isAvailabilityTest() {
        //given
        Period car1 = new Period(LocalDate.of(2019, 11, 1), LocalDate.of(2019, 11, 4));
        Period car2 = new Period(LocalDate.of(2019, 11, 1), LocalDate.of(2019, 11, 12));
        Period car3 = new Period(LocalDate.of(2019, 11, 11), LocalDate.of(2019, 11, 12));
        Period car4 = new Period(LocalDate.of(2019, 11, 6), LocalDate.of(2019, 11, 12));

        LocalDate startTime = (LocalDate.of(2019, 11, 5));
        LocalDate endTime = (LocalDate.of(2019, 11, 10));

        //when
        boolean test = car1.isContains(startTime, endTime);
        boolean test2 = car2.isContains(startTime, endTime);
        boolean test3 = car3.isContains(startTime, endTime);
        boolean test4 = car3.isContains(startTime, endTime);

        //then
        Assertions.assertTrue(test);
        Assertions.assertFalse(test2);
        Assertions.assertTrue(test3);
        Assertions.assertTrue(test4);

    }
}