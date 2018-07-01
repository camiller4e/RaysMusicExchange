import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;
    private Owner owner;

    public Shop(String name, Owner owner) {
        this.name = name;
        this.stock = stock;
        this.owner = owner;
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
}
