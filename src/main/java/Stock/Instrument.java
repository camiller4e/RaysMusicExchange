package Stock;

import Manufacturers.Manufacturer;

public abstract class Instrument extends Stock {
    private String colour;
    private String type;
    private String model;

    public Instrument(int buyPrice, int sellPrice, Manufacturer manufacturer, String colour, String type, String model) {
        super(buyPrice, sellPrice, manufacturer);
        this.colour = colour;
        this.type = type;
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

}
