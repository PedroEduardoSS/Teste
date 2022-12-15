package model;

public class Budget extends Service{
    private String title;
    private String description;
    private String nameUser;
    private String idUser;
    
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getIdUser() {
        return idUser;
    }


    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }


    public String getNameUser() {
        return nameUser;
    }


    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    // Methods
    public double multiplyPrice(){
        if (isProduct() == true && getQtd_product() > 1) {
            this.price = price*getQtd_product();
        }
        return this.price;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+this.title+", Descricao: "+this.description+
        ", Preco: R$"+String.format("%.2f", this.price)+", Cliente: "+this.nameUser;
    }
}