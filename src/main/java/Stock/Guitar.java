package Stock;

import Behaviours.IPlay;
import Behaviours.ISell;
import Manufacturers.Manufacturer;

public class Guitar extends Instrument implements IPlay, ISell {
    private int stringNum;

    public Guitar(int buyPrice, int sellPrice, Manufacturer manufacturer, String colour, String type, String model, int stringNum) {
        super(buyPrice, sellPrice, manufacturer, colour, type, model);
        this.stringNum = stringNum;
    }

    public int getStringNum() {
        return stringNum;
    }

    public String play() {
        return "strum strummm";
    }

    public int calculateMarkup() {
        int profit = getSellPrice() - getBuyPrice();
        return profit;
    }
}
