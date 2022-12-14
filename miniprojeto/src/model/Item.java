package model;

abstract class Item {
    protected String idItem;
    protected String nameItem;
    protected String info;
    protected double price;

    public String getIdItem() {
        return idItem;
    }
    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }
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