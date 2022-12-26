package model;

import java.util.LinkedList;

public class Budget {
    private String title;
    private LinkedList<Product> products;
    private LinkedList<Service> services;
    private double totalPrice;
    private Product product;
    private Service service;
    private User user;

    public Budget(){
        this.products = new LinkedList<Product>();
        this.services = new LinkedList<Service>();
        this.totalPrice = 0;
        this.user = new User();
        this.product = new Product();
        this.service = new Service();
    }
    
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public LinkedList<Product> getProducts() {
        return products;
    }


    public void setProducts(LinkedList<Product> products) {
        this.products = products;
    }


    public LinkedList<Service> getServices() {
        return services;
    }


    public void setServices(LinkedList<Service> services) {
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
        return "Titulo: "+this.title+", Servicos: "+getServices()+"Produtos: "+getProducts()+
        ", Preco Total: R$"+String.format("%.2f", getTotalPrice())+", Cliente: "+getUser();
    }

    public void createItem(int setCategory, String idItem, String nameItem, String info, double price, int deadlineOrQuantity){
        switch (setCategory) {
            case 1:
                this.product.setIdItem(idItem);
                this.product.setNameItem(nameItem);
                this.product.setInfo(info);
                this.product.setPrice(price);
                this.product.setQuantity(deadlineOrQuantity);
                this.product.multiplyPrice();
                this.products.add(this.product);
                break;

            case 2:
                this.service.setNameItem(nameItem);
                this.service.setInfo(info);
                this.service.setPrice(price);
                this.service.setDeadline(deadlineOrQuantity);
                this.services.add(this.service);
                break;
        
            default:
                System.out.println("Escolha a categoria");
                break;
        }
    }

    public void readItens(int setCategory){
        switch (setCategory) {
            case 1:
                for (Product i : this.products){
                    System.out.println(i);
                }
                break;

            case 2:
                for (Service i : this.services){
                    System.out.println(i);
                }
                break;        
        
            default:
                System.out.println("Escolha a categoria");
                break;
        }
    }

    public void updateItem(int setCategory, String idItem, String data, int setAt){
        switch (setCategory) {
            case 1:
                for (Product i : this.products){
                    if (i.getIdItem() == idItem){
                        switch (setAt) {
                            case 1:
                                i.setIdItem(data);
                                break;
                            
                            case 2:
                                i.setInfo(data);
                                break;
                                
                            case 3:
                                i.setNameItem(data);
                                break;
                                
                            case 4:
                                double doubleData = Double.valueOf(data);
                                i.setPrice(doubleData);
                                this.product.multiplyPrice();
                                break;
                                
                            case 5:
                                int intData = Integer.valueOf(data);
                                i.setQuantity(intData);
                                this.product.multiplyPrice();
                                break;
                        
                            default:
                                break;
                        }
                    }
                    break;
                }
                break;

            case 2:
                for (Service i : this.services){
                    if (i.getIdItem() == idItem){
                        switch (setAt) {
                            case 1:
                                i.setIdItem(data);
                                break;
                            
                            case 2:
                                i.setInfo(data);
                                break;
                                
                            case 3:
                                i.setNameItem(data);
                                break;
                                
                            case 4:
                                double doubleData = Double.valueOf(data);
                                i.setPrice(doubleData);
                                break;
                                
                            case 5:
                                int intData = Integer.valueOf(data);
                                i.setDeadline(intData);
                                break;
                        
                            default:
                                break;
                        }
                    }
                    break;
                }
                break;
        
            default:
                System.out.println("Escolha a categoria");
                break;
        }
    }

    public void deleteItem(int setCategory, String idItem){//preciso arrumar essa função
        switch (setCategory) {
            case 1:
                for (Product i : this.products){
                    if (i.getIdItem() == idItem){
                        this.products.remove(i);
                    }
                    break;
                }
                break;

            case 2:
                for (Service i : this.services){
                    if (i.getIdItem() == idItem){
                        this.services.remove(i);
                    }
                    break;
                }
                break;
        
            default:
                System.out.println("Escolha a categoria");
                break;
        }
    }

}