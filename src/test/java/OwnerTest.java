import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OwnerTest {

    Owner Ray;

    @Before
    public void setUp() throws Exception {
        Ray = new Owner("Ray");
    }

    @Test
    public void isRay() {
        assertEquals("Ray", Ray.getName());
    }

    @Test
    public void canPreventTheft() {
        assertEquals("*shoots at kid trying to steal guitar* 'now go on, get!'", Ray.preventTheft());
    }
}
