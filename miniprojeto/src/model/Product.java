package model;
/**
 * Classe Product cria um novo Produto dentro de um orçamento
 * e recebe quatro parâmetros no construtor e herda da classe
 * Item.
 * @param nameItem -> String que representa o nome do item
 * @param info -> String que representa breve informação do item
 * @param price -> Double que representa preço do item
 * @param quantity -> Integer que representa a quantidade de produtos
 * @author Pedro Eduardo Santos Sousa
 */
public class Product extends Item{
    private int quantity;

    public Product(String nameItem, String info, double price, int quantity){
        this.nameItem = nameItem;
        this.info = info;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Nome do item: "+this.nameItem+", Info: "+this.info+", Quantidade: "+getQuantity()+
        ", Preco: R$"+String.format("%.2f", this.price);
    }

}
