package Stock;

import Manufacturers.Manufacturer;

public class Accessories extends Stock {
    private String type;

    public Accessories(int buyPrice, int sellPrice, Manufacturer manufacturer, String type) {
        super(buyPrice, sellPrice, manufacturer);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
