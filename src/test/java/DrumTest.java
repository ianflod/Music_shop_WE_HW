import enums.DrumVariant;
import enums.InstrumentType;
import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum("Nylon", "Green", 300, 600, InstrumentType.WOODWIND, 5, DrumVariant.SNARE);
    }

    @Test
    public void drumHasWeight(){
        assertEquals(5, drum.getWeight());
    }

    @Test
    public void drumHasVariant(){
        assertEquals(DrumVariant.SNARE, drum.getVariant());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(300, drum.calculateMarkup());
    }

    @Test
    public void drumCanBePlayed(){
        assertEquals("Rat a Tat", drum.play());
    }
}
