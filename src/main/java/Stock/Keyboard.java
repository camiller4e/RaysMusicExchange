package Stock;

import Behaviours.IPlay;
import Manufacturers.Manufacturer;

public class Keyboard extends Instrument implements IPlay {
    private String kind;

    public Keyboard(int buyPrice, int sellPrice, Manufacturer manufacturer, String colour, String type, String model, String kind) {
        super(buyPrice, sellPrice, manufacturer, colour, type, model);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public String play() {
        return "plink plonk";
    }
}
