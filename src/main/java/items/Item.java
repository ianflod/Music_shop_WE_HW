package items;

import behaviours.ISell;

public abstract class Item implements ISell {

    private int buyPrice;
    private int sellPrice;

    public Item (int buyPrice, int sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
