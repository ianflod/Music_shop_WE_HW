package instruments;

import enums.DrumVariant;
import enums.InstrumentType;

public class Drum extends Instrument{

    private int weight;
    private DrumVariant variant;


    public Drum(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, int weight, DrumVariant variant) {
        super(material, colour, buyPrice, sellPrice, type);
        this.weight = weight;
        this.variant = variant;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public DrumVariant getVariant() {
        return variant;
    }

    public void setVariant(DrumVariant variant) {
        this.variant = variant;
    }

    public String play(){
        return "Rat a Tat";
    }
}
