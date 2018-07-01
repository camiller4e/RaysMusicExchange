import Manufacturers.Manufacturer;
import Stock.Accessories;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccessoriesTest {

    Accessories accessories;

    @Before
    public void setUp() throws Exception {
        accessories = new Accessories(5, 10, Manufacturer.MARTIN, "strings");
    }

    @Test
    public void hasType() {
        assertEquals("strings", accessories.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5, accessories.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10, accessories.getSellPrice());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Martin", accessories.getNameFromManufacturer());
    }

    @Test
    public void canSetSellPrice() {
        accessories.setSellPrice(12);
        assertEquals(12, accessories.getSellPrice());
    }

    @Test
    public void canCalculateMarkup() {
        accessories.calculateMarkup();
        assertEquals(5, accessories.calculateMarkup());
    }
}
