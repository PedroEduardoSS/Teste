package model;

public class Price {
    protected double value;
    protected boolean product;
    protected int qtd_product;
    
    /*
    protected Price(double value, boolean product, int qtd_product){
        this.value = value;
        this.product = product;
        this.qtd_product = qtd_product;
    } */
    

    public double getValue() {
        return value;
    }


    public void setValue(double value) {
        this.value = value;
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
    public double multiplyPrice(){
        this.value = value*qtd_product;
        return this.value;
    }

}