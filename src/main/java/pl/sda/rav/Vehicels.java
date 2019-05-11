package pl.sda.rav;

public abstract class Vehicels{
    private String vin;
    private String status;
    private String name;
    private int productionDate;

    @Override
    public String toString() {
        return "Vehicels{" +
                "vin='" + vin + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }

    public Vehicels(String vin, String status, String name, int productionDate) {
        this.vin = vin;
        this.status = status;
        this.name = name;
        this.productionDate = productionDate;

    }

    public String getVin() {
        return vin;

    }
}
