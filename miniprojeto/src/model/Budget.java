package model;

import control.ControllerItem;

public class Budget {
    private String title;
    private ControllerItem ctrlItem;
    private User user;


    public Budget(){
        this.user = new User();
        this.ctrlItem = new ControllerItem();
    }
    
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }

    // Methods
    @Override
    public String toString(){
        return "Titulo: "+this.title+", Preco Total: R$"+
        String.format("%.2f", this.ctrlItem.getTotalPrice())+", Cliente: "+getUser();
    }

    public void showProducts(){
        this.ctrlItem.readItens(1);
    }
    
    public void showServices(){
        this.ctrlItem.readItens(2);
    }
}