import Manufacturers.Manufacturer;
import Stock.Guitar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(100, 200, Manufacturer.FENDER, "sunburst", "string", "Telecaster", 6);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(100, guitar.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(200, guitar.getSellPrice());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Fender", guitar.getNameFromManufacturer());
    }

    @Test
    public void hasColour() {
        assertEquals("sunburst", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("string", guitar.getType());
    }

    @Test
    public void hasModel() {
        assertEquals("Telecaster", guitar.getModel());
    }

    @Test
    public void canSetSellPrice() {
        guitar.setSellPrice(250);
        assertEquals(250, guitar.getSellPrice());
    }

    @Test
    public void hasStringNum() {
        assertEquals(6, guitar.getStringNum());
    }

    @Test
    public void canPlay() {
        assertEquals("strum strummm", guitar.play());
    }
}
