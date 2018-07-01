package Stock;

import Behaviours.IPlay;
import Behaviours.ISell;
import Manufacturers.Manufacturer;

public class Sax extends Instrument implements IPlay, ISell {
    private String size;

    public Sax(int buyPrice, int sellPrice, Manufacturer manufacturer, String colour, String type, String model, String size) {
        super(buyPrice, sellPrice, manufacturer, colour, type, model);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play() {
        return "Ba-a-aker StreEEeet";
    }

    public int calculateMarkup() {
        int profit = getSellPrice() - getBuyPrice();
        return profit;
    }
}
