import Manufacturers.Manufacturer;
import Stock.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        keyboard = new Keyboard(300, 600, Manufacturer.KORG, "black", "keyboard", "MicroKORG", "synthesiser");
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(300, keyboard.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(600, keyboard.getSellPrice());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Korg", keyboard.getNameFromManufacturer());
    }

    @Test
    public void hasColour() {
        assertEquals("black", keyboard.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("keyboard", keyboard.getType());
    }

    @Test
    public void hasModel() {
        assertEquals("MicroKORG", keyboard.getModel());
    }

    @Test
    public void canSetSellPrice() {
        keyboard.setSellPrice(750);
        assertEquals(750, keyboard.getSellPrice());
    }

    @Test
    public void hasKind() {
        assertEquals("synthesiser", keyboard.getKind());
    }

    @Test
    public void canPlay() {
        assertEquals("plink plonk", keyboard.play());
    }
}
