package model;
/**
 * Classe Service cria um novo Servico dentro de um orcamento
 * e recebe quatro parametros no construtor e herda da classe
 * Item.
 * @param nameItem -> String que representa o nome do item
 * @param info -> String que representa breve informacao do item
 * @param price -> Double que representa preco do item
 * @param deadline -> Integer que representa o prazo do servico
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
