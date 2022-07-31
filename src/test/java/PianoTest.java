import enums.InstrumentType;
import enums.PianoVariant;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Wood", "Black", 1000, 2000, InstrumentType.STRING, 96, PianoVariant.BABY_GRAND);

    }

    @Test
    public void pianoHasKeys(){
        assertEquals(96, piano.getNoOfKeys());
    }

    @Test
    public void pianoHasAType(){
        assertEquals(PianoVariant.BABY_GRAND, piano.getVariant());
    }

    @Test
    public void canCalculateMarkup(){assertEquals(1000, piano.calculateMarkup());}

    @Test
    public void pianoCanBePlayed(){
        assertEquals("Tinkle tinkle", piano.play());
    }


}
