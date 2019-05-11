package pl.sda.rav;

import java.time.LocalDate;

public class MotorBoard extends Vehicels{
    private int maxDistanceMiles;
    private String displacement;

    public MotorBoard(String vin, boolean status, String name, LocalDate productionDate, int maxDistanceMiles, String displacement) {
        super(vin, status, name, productionDate);
        this.maxDistanceMiles = maxDistanceMiles;
        this.displacement = displacement;


    }

    @Override
    public String toString() {
        return "MotorBoard{" +
                "maxDistanceMiles=" + maxDistanceMiles +
                ", displacement='" + displacement + '\'' +
                '}';
    }


}
