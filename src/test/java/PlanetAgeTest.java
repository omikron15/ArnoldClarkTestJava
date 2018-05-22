import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlanetAgeTest {

    @Before
    public void setUp(){

    }

    @Test
    public void earthAge() {
        assertEquals(1.00, PlanetAge.earthAge(31557600), 0.1);
    }

    @Test
    public void mercuryAge() {
        assertEquals(0.24, PlanetAge.mercuryAge(31557600), 0.1);
    }
}
