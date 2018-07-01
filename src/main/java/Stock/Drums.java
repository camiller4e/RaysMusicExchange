package Stock;

import Behaviours.IPlay;
import Behaviours.ISell;
import Manufacturers.Manufacturer;

public class Drums extends Instrument implements IPlay, ISell {
    private int pieceNum;

    public Drums(int buyPrice, int sellPrice, Manufacturer manufacturer, String colour, String type, String model, int pieceNum) {
        super(buyPrice, sellPrice, manufacturer, colour, type, model);
        this.pieceNum = pieceNum;
    }

    public int getPieceNum() {
        return pieceNum;
    }

    public String play() {
        return "boom-CRASH the sound of my DRUMS";
    }

    public int calculateMarkup() {
        int profit = getSellPrice() - getBuyPrice();
        return profit;
    }
}
