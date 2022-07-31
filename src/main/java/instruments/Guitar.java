package instruments;

import enums.GuitarVariant;
import enums.InstrumentType;

public class Guitar extends Instrument {

    private int noOfStrings;
    private GuitarVariant variant;

    public Guitar(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, int noOfStrings, GuitarVariant variant) {
        super(material, colour, buyPrice, sellPrice, type);
        this.noOfStrings = noOfStrings;
        this.variant = variant;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    public GuitarVariant getVariant() {
        return variant;
    }

    public void setVariant(GuitarVariant variant) {
        this.variant = variant;
    }

    public String play(){
        return "Twang twang";
    }
}
