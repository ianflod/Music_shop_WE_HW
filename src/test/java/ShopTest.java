import behaviours.ISell;
import enums.DrumVariant;
import enums.GuitarVariant;
import enums.InstrumentType;
import enums.PianoVariant;
import instruments.Drum;
import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    Piano piano;
    Drum drum;
    ISell isell;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Sitka", "Blue", 1000, 2000, InstrumentType.STRING, 12, GuitarVariant.ELECTRIC);
        drum = new Drum("Birch", "Green", 300, 600, InstrumentType.WOODWIND, 4, DrumVariant.SNARE);
        piano = new Piano("Maple", "Ebony", 2000, 4000, InstrumentType.STRING, 88, PianoVariant.GRAND);
    }

    @Test
    public void shopHasNoStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void shopHasStock(){
        shop.addStock(isell);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void shopCanReduceStock(){
        shop.addStock(isell);
        shop.addStock(isell);
        shop.addStock(isell);
        shop.removeStock(isell);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canGetTotalMarkup(){
        shop.addStock(drum);
        shop.addStock(guitar);
        shop.addStock(piano);
        assertEquals(3300, shop.totalPotentialMarkup());
    }
}
