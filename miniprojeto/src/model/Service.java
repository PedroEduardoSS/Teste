package model;
/**
 * Classe Service cria um novo Serviço dentro de um orçamento
 * e recebe quatro parâmetros no construtor e herda da classe
 * Item.
 * @param nameItem -> String que representa o nome do item
 * @param info -> String que representa breve informação do item
 * @param price -> Double que representa preço do item
 * @param deadline -> Integer que representa o prazo do serviço
 * @author Pedro Eduardo Santos Sousa
 */
public class Service extends Item{
    private int deadline;

    public Service(String nameItem, String info, double price, int deadline){
        this.nameItem = nameItem;
        this.info = info;
        this.price = price;
        this.deadline = deadline;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

        
    // Methods
    @Override
    public String toString(){
        return "Nome do item: "+this.nameItem+", Info: "+this.info+", Prazo: "+getDeadline()+
        ", Preco: R$"+String.format("%.2f", this.price);
    }

}
