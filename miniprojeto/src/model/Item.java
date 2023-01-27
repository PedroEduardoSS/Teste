package model;
/**
 * Classe Item é uma classe abstrata que será herdada das classes
 * Product e Service. Três parâmetros são utilizados pelas classes herdeiras.
 * @param nameItem -> String que representa o nome do item
 * @param info -> String que representa breve informação do item
 * @param price -> Double que representa preço do item
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