package Stock;

import Behaviours.ISell;
import Manufacturers.Manufacturer;

public class Accessories extends Stock implements ISell {
    private String type;

    public Accessories(int buyPrice, int sellPrice, Manufacturer manufacturer, String type) {
        super(buyPrice, sellPrice, manufacturer);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int calculateMarkup() {
        int profit = getSellPrice() - getBuyPrice();
        return profit;
    }
}
