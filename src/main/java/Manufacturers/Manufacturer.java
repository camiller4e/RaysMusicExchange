package Manufacturers;

public enum Manufacturer {

    FENDER("Fender"),
    YAMAHA("Yamaha"),
    KORG("Korg"),
    MARTIN("Martin"),
    ERNIEBALL("Ernie Ball");

    public final String name;

    Manufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
