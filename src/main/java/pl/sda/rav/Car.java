package pl.sda.rav;

public class Car extends Vehicels {
   private int maxDistanceKm;
   private String bodyType;


   public Car(String vin, String status, String name, int productionDate, int maxDistanceKm, String bodyType) {
      super(vin, status, name, productionDate);
   }
}

