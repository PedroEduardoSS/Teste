package model;

abstract class Service {
    protected double price;
    protected boolean product;
    protected int qtd_product;

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public boolean isProduct() {
        return product;
    }


    public void setProduct(boolean product) {
        this.product = product;
    }


    public int getQtd_product() {
        return qtd_product;
    }


    public void setQtd_product(int qtd_product) {
        this.qtd_product = qtd_product;
    }
    
    // Methods
    abstract double multiplyPrice();

}
