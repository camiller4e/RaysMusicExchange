import Behaviours.ISell;
import Manufacturers.Manufacturer;
import Stock.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Owner Ray;
    Guitar guitar;
    Bass bass;
    Drums drums;
    Keyboard keyboard;
    Sax sax;
    Accessories strings;
    Accessories drumsticks;
    ArrayList<ISell> stock;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Ray's Music Exchange", Ray, stock);
        stock = new ArrayList<ISell>();
        guitar = new Guitar(100, 200, Manufacturer.FENDER, "sunburst", "string", "Telecaster", 6);
        bass = new Bass(150, 300, Manufacturer.FENDER, "white", "string", "Jazz", 4);
        drums = new Drums(500, 1000, Manufacturer.YAMAHA, "pink", "percussion", "Stage", 4);
        keyboard = new Keyboard(300, 600, Manufacturer.KORG, "black", "keyboard", "MicroKORG", "synthesiser");
        sax = new Sax(600, 900, Manufacturer.YAMAHA, "brass", "brass", "YTS-23", "tenor");
        strings = new Accessories(5, 10, Manufacturer.MARTIN, "strings");
        drumsticks = new Accessories(5, 20, Manufacturer.YAMAHA, "drumsticks");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals(Ray, shop.getOwner());
    }

    @Test
    public void canAddToStock() {
        ArrayList<ISell> stock = new ArrayList<ISell>();
        stock.add(guitar);
        stock.add(drums);
        stock.add(bass);
        stock.add(keyboard);
        stock.add(sax);
        stock.add(strings);
        stock.add(drumsticks);
        assertEquals(7, stock.size());
    }

    @Test
    public void canRemoveFromStock() {
        ArrayList<ISell> stock = new ArrayList<ISell>();
        stock.add(guitar);
        stock.add(drums);
        stock.add(bass);
        stock.add(keyboard);
        stock.add(sax);
        stock.add(strings);
        stock.add(drumsticks);
        stock.remove(sax);
        assertEquals(6, stock.size());
    }

    @Test
    public void canGetTotalProjectedProfits() {
        ArrayList<ISell> stock = new ArrayList<ISell>();
        stock.add(guitar);
        stock.add(drums);
        assertEquals(600, shop.getTotalProjectedProfits());
    }
}
