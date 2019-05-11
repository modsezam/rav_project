package pl.sda.rav;

import java.time.LocalDate;

public abstract class Vehicels{
    private String vin;
    private boolean status;
    private String name;
    private LocalDate productionDate;

    @Override
    public String toString() {
        return "Vehicels{" +
                "vin='" + vin + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }

    public Vehicels(String vin, boolean status, String name, LocalDate productionDate) {
        this.vin = vin;
        this.status = status;
        this.name = name;
        this.productionDate = productionDate;

    }

    public String getVin() {
        return vin;

    }
}
