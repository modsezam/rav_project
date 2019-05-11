package pl.sda.rav;

public enum BodyType {
    SEDAN("Sedan"),
    SUV("SUV"),
    CROSSOVER("Crossover"),
    COUPE("Coupe");

    private String bodyType;

    BodyType(String symbol) {
        this.bodyType = symbol;
    }
}
