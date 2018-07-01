import Manufacturers.Manufacturer;
import Stock.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void setUp() throws Exception {
        bass = new Bass(150, 300, Manufacturer.FENDER, "white", "string", "Jazz", 4);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(150, bass.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(300, bass.getSellPrice());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Fender", bass.getNameFromManufacturer());
    }

    @Test
    public void hasColour() {
        assertEquals("white", bass.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("string", bass.getType());
    }

    @Test
    public void hasModel() {
        assertEquals("Jazz", bass.getModel());
    }

    @Test
    public void canSetSellPrice() {
        bass.setSellPrice(350);
        assertEquals(350, bass.getSellPrice());
    }

    @Test
    public void hasStringNum() {
        assertEquals(4, bass.getStringNum());
    }

    @Test
    public void canPlay() {
        assertEquals("boom-ba-doom-SLAP-boom", bass.play());
    }

    @Test
    public void canCalculateMarkup() {
        bass.calculateMarkup();
        assertEquals(150, bass.calculateMarkup());
    }
}
