package pl.sda.rav;

import java.time.LocalDate;

public class Amphibian extends Vehicels{
    private int maxDistanceKm;
    private int maxDistanceMiles;
    private int displacement;

    public Amphibian(String vin, boolean status, String name, LocalDate productionDate, int maxDistanceKm, int maxDistanceMiles, int displacement) {
        super(vin, status, name, productionDate);

        this.maxDistanceKm = maxDistanceKm;
        this.maxDistanceMiles = maxDistanceMiles;
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "maxDistanceKm=" + maxDistanceKm +
                ", maxDistanceMiles='" + maxDistanceMiles + '\'' +
                ", displacement=" + displacement +
                '}';
    }
}
