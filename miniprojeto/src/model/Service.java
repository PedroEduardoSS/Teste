package model;

public class Service extends Item{
    private int deadline;

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

        
    // Methods
    @Override
    public String toString(){
        return "Nome do item: "+this.nameItem+", Info: "+this.info+"Prazo: "+getDeadline()+
        ", Preco: R$"+String.format("%.2f", this.price);
    }

}
