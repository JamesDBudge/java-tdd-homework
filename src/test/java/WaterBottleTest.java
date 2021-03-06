import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before (){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
    public void canDrinkFromBottle() {
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }
    @Test
    public void canEmptyBottle() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
}
