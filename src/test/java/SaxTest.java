import Manufacturers.Manufacturer;
import Stock.Sax;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxTest {

    Sax sax;

    @Before
    public void setUp() throws Exception {
        sax = new Sax(600, 900, Manufacturer.YAMAHA, "brass", "brass", "YTS-23", "tenor");
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(600, sax.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(900, sax.getSellPrice());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Yamaha", sax.getNameFromManufacturer());
    }

    @Test
    public void hasColour() {
        assertEquals("brass", sax.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("brass", sax.getType());
    }

    @Test
    public void hasModel() {
        assertEquals("YTS-23", sax.getModel());
    }

    @Test
    public void canSetSellPrice() {
        sax.setSellPrice(1100);
        assertEquals(1100, sax.getSellPrice());
    }

    @Test
    public void hasSize() {
        assertEquals("tenor", sax.getSize());
    }

    @Test
    public void canPlay() {
        assertEquals("Ba-a-aker StreEEeet", sax.play());
    }
}
