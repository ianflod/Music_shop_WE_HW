import instruments.Drum;
import items.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks(8,16, "Hickory", "White");
    }

    @Test
    public void drumsticksHaveSellPrice(){
        assertEquals(16, drumsticks.getSellPrice());
    }

    @Test
    public void drumsticksHaveColour(){
        assertEquals("White", drumsticks.getColour());
    }

    @Test
    public void drumsticksHaveBuyPrice(){
        assertEquals(8, drumsticks.getBuyPrice());
    }

}
