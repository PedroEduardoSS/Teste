package model;

abstract class Product {
    protected double price;
    protected boolean product;
    protected int qtd_product;
    
    /*
    protected Price(double value, boolean product, int qtd_product){
        this.value = value;
        this.product = product;
        this.qtd_product = qtd_product;
    } */
    

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
