package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop( ) {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addStock(ISell isell){
        stock.add(isell);
    }

    public void removeStock(ISell isell){
        stock.remove(isell);
    }

    public int totalPotentialMarkup(){
        int totalProfit = 0;
        for(ISell i : stock){
        int profit = i.calculateMarkup();
        totalProfit += profit;
        }
        return totalProfit;
    }

}
