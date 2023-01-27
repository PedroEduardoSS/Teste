package model;
/**
 * Classe Item e uma classe abstrata que sera herdada das classes
 * Product e Service. Tres parametros sao utilizados pelas classes herdeiras.
 * @param nameItem -> String que representa o nome do item
 * @param info -> String que representa breve informacao do item
 * @param price -> Double que representa preco do item
 * @author Pedro Eduardo Santos Sousa
 */
abstract class Item {
    protected String nameItem;
    protected String info;
    protected double price;

    public String getNameItem() {
        return nameItem;
    }
    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
}