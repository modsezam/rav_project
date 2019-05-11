package pl.sda.rav;

import java.time.LocalDate;

public class VehicleSamples {

    public static MotorBoard MOTORBOAT = new MotorBoard("7387483264", true, "Motorboat", LocalDate.of(2019, 05, 8), 2000, "2100" );
    public static Amphibian AMPHIBIAN1 = new Amphibian("54354545454", true, "Amphibian", LocalDate.of(2018, 8, 6), 3000, 1400, 5000);
    public static Car CAR = new Car("648384766", true, "Amphibian", LocalDate.of(2018, 8, 6), 3000, BodyType.COUPE);


}
