package model;

import java.util.ArrayList;

public class Budget {
    private String id;
    private String title;
    private ArrayList<Product> products;
    private ArrayList<Service> services;
    private double totalPrice;
    private User user;

    public Budget(String id, String title, ArrayList<Product> products, ArrayList<Service> services,
    String userId, String userName, String userEmail){
        this.id = id;
        this.title = title;
        this.user = new User(userId, userName, userEmail);
        this.products = products;
        this.services = services;
        this.totalPrice = 0;
    }
    
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }


    public ArrayList<Service> getServices() {
        return services;
    }


    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }


    public double getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
        return "ID: "+this.id+", Titulo: "+this.title+",\nProdutos"+this.products+
        ",\nServiços: "+this.services+",\nPreco Total: R$"+
        String.format("%.2f", getTotalPrice())+
        ", Cliente: "+getUser();
    }

    public double updatePrice(){
        for (Product i : this.products){
            this.totalPrice += i.getPrice();
        }
        for (Service i : this.services){
            this.totalPrice += i.getPrice();
        }
        return totalPrice;
    }
}