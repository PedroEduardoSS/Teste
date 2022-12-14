package model;

public class Product extends Item{
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Methods
    public double multiplyPrice(){
        if (getQuantity() > 1) {
            this.price *= getQuantity();
        }
        return this.price;
    }

    @Override
    public String toString(){
        return "Nome do item: "+this.nameItem+", Info: "+this.info+"Quantidade: "+getQuantity()+
        ", Preco: R$"+String.format("%.2f", this.price);
    }

}
