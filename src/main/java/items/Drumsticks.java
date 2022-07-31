package items;

public class Drumsticks extends Item{

    private String material;
    private String colour;

    public Drumsticks(int buyPrice, int sellPrice, String material, String colour) {
        super(buyPrice, sellPrice);
        this.material = material;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
