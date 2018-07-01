package Stock;

import Manufacturers.Manufacturer;

public abstract class Stock {
    private int buyPrice;
    private int sellPrice;
    private Manufacturer manufacturer;

    public Stock(int buyPrice, int sellPrice, Manufacturer manufacturer) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.manufacturer = manufacturer;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getNameFromManufacturer() {
        return this.manufacturer.getName();
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
