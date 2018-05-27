import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlanetAgeTest {

    @Before
    public void setUp(){

    }

    @Test
    public void earthAge() {
        assertEquals(10.00, PlanetAge.earthAge(315360000), 0.1);
    }

    @Test
    public void earthAgeTwo() {
        assertEquals(31.7, PlanetAge.earthAge(1000000000), 0.1);
    }

    @Test
    public void mercuryAge() {
        assertEquals(41.5, PlanetAge.mercuryAge(315360000), 0.1);
    }

    @Test
    public void venusAge() {
        assertEquals(16.2, PlanetAge.venusAge(315360000), 0.1);
    }

    @Test
    public void marsAge() {
        assertEquals(5.3, PlanetAge.marsAge(315360000), 0.1);
    }

    @Test
    public void jupiterAge() {
        assertEquals(0.84, PlanetAge.jupiterAge(315360000), 0.1);
    }

    @Test
    public void saturnAge() {
        assertEquals(0.33, PlanetAge.saturnAge(315360000), 0.1);
    }

    @Test
    public void uranusAge() {
        assertEquals(0.11, PlanetAge.uranusAge(315360000), 0.1);
    }

    @Test
    public void neptuneAge() {
        assertEquals(0.06, PlanetAge.neptuneAge(315360000), 0.1);
    }

    @Test
    public void plutoAge() {
        assertEquals(0.04, PlanetAge.plutoAge(315360000), 0.1);
    }


}
