package pl.sda.rav;

import java.time.LocalDate;

public class Car extends Vehicels {
   private int maxDistanceKm;
   private BodyType bodyType;


   public Car(String vin, boolean status, String name, LocalDate productionDate, int maxDistanceKm, BodyType bodyType) {
      super(vin, status, name, productionDate);
      this.maxDistanceKm = maxDistanceKm;
      this.bodyType = bodyType;



   }
}

