package instruments;

import enums.InstrumentType;
import enums.PianoVariant;

public class Piano extends Instrument{

    private int noOfKeys;
    private PianoVariant variant;


    public Piano(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, int noOfKeys, PianoVariant variant) {
        super(material, colour, buyPrice, sellPrice, type);
        this.noOfKeys = noOfKeys;
        this.variant = variant;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public void setNoOfKeys(int noOfKeys) {
        this.noOfKeys = noOfKeys;
    }

    public PianoVariant getVariant() {
        return variant;
    }

    public void setVariant(PianoVariant variant) {
        this.variant = variant;
    }

    public String play() {
        return "Tinkle tinkle";
    }

}
