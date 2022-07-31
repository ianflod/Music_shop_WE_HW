import enums.GuitarVariant;
import enums.InstrumentType;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood", "Red", 100, 150, InstrumentType.STRING, 6, GuitarVariant.ELECTRIC);

    }

    @Test
    public void hasSellPrice(){
        assertEquals(150, guitar.getSellPrice());
    }

    @Test
    public void hasGuitarVariant(){
        assertEquals(GuitarVariant.ELECTRIC, guitar.getVariant());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, guitar.calculateMarkup());
    }

    @Test
    public void guitarCanBePlayed(){
        assertEquals("Twang twang", guitar.play());
    }


}
