import Behaviours.ISell;
import Stock.Instrument;

import java.util.ArrayList;

public class Shop {
    private String name;
    private Owner owner;
    private ArrayList<ISell> stock;

    public Shop(String name, Owner owner, ArrayList<ISell> stock) {
        this.name = name;
        this.owner = owner;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int getTotalProjectedProfits(){
        int totalProfit = 0;
        for (ISell instrument : stock){
            totalProfit += instrument.calculateMarkup();
        }
        return totalProfit;
    }

    public int stockCount(){
        return stock.size();
    }
}
