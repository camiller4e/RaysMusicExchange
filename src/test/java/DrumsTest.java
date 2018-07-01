import Manufacturers.Manufacturer;
import Stock.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp() throws Exception {
        drums = new Drums(500, 1000, Manufacturer.YAMAHA, "pink", "percussion", "Stage", 4);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(500, drums.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(1000, drums.getSellPrice());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Yamaha", drums.getNameFromManufacturer());
    }

    @Test
    public void hasColour() {
        assertEquals("pink", drums.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("percussion", drums.getType());
    }

    @Test
    public void hasModel() {
        assertEquals("Stage", drums.getModel());
    }

    @Test
    public void canSetSellPrice() {
        drums.setSellPrice(1200);
        assertEquals(1200, drums.getSellPrice());
    }

    @Test
    public void hasPieceNum() {
        assertEquals(4, drums.getPieceNum());
    }

    @Test
    public void canPlay() {
        assertEquals("boom-CRASH the sound of my DRUMS", drums.play());
    }

    @Test
    public void canCalculateMarkup() {
        drums.calculateMarkup();
        assertEquals(500, drums.calculateMarkup());
    }

}
