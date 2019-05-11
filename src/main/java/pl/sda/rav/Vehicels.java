package pl.sda.rav;

public abstract class Vehicels{
    private String vin;
    private String status;
    private String name;
    private int productionDate;

    public Vehicels(String vin, String status, String name, int productionDate) {
        this.vin = vin;
        this.status = status;
        this.name = name;
        this.productionDate = productionDate;
    }
}
