package model;

public class Budget extends Product{
    private String title;
    private String description;
    private String nameUser;
    private String idUser;
    
    // Constructor
    /*
    public Budget(String title, String description, String nameUser, String idUser, double value, boolean product, int qtd_product) {
        super(value, product, qtd_product);
        this.title = title;
        this.description = description;
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.value = value;
        this.product = product;
        this.qtd_product = qtd_product;
    } */
    
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
        this.price = price*qtd_product;
        return this.price;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+this.title+", Descricao: "+this.description+", Preco: "+this.price;
    }
}