import items.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before(){
        strings = new Strings(5, 10, 11, "Nylon");
    }

    @Test
    public void stringsHasGauge(){
        assertEquals(11, strings.getGauge());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5, strings.calculateMarkup());
    }

    @Test
    public void stringsHaveSellPrice(){
        assertEquals(10, strings.getSellPrice());
    }
}
