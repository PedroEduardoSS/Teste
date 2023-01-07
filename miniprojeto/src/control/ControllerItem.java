package control;

import java.util.HashSet;
import java.util.Iterator;
import model.Product;
import model.Service;

public class ControllerItem {
    private HashSet<Product> products;
    private HashSet<Service> services;
    private double totalPrice;

    public ControllerItem(){
        this.products = new HashSet<Product>();
        this.services = new HashSet<Service>();
        this.totalPrice = 0;
    }
    

    public HashSet<Product> getProducts() {
        return products;
    }
    public void setProducts(HashSet<Product> products) {
        this.products = products;
    }
    public HashSet<Service> getServices() {
        return services;
    }
    public void setServices(HashSet<Service> services) {
        this.services = services;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void createItem(int setCategory, String idItem, String nameItem, String info, double price, int deadlineOrQuantity){
        switch (setCategory) {
            case 1:
                Product product = new Product();
                product.setIdItem(idItem);
                product.setNameItem(nameItem);
                product.setInfo(info);
                product.setPrice(price);
                product.setQuantity(deadlineOrQuantity);
                product.multiplyPrice();
                products.add(product);
                break;

            case 2:
                Service service = new Service();
                service.setNameItem(nameItem);
                service.setInfo(info);
                service.setPrice(price);
                service.setDeadline(deadlineOrQuantity);
                services.add(service);
                break;
        
            default:
                System.out.println("Escolha a categoria");
                break;
        }
    }

    public void readItem(int setCategory, String idItem){
        switch (setCategory) {
            case 1:
                for (Product i : this.products){
                    if (i.getIdItem() == idItem){
                        System.out.println(i);
                    }
                }
                break;

            case 2:
                for (Service i : this.services){
                    if (i.getIdItem() == idItem){
                        System.out.println(i);
                    }
                }
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
                                i.multiplyPrice();
                                break;
                                
                            case 5:
                                int intData = Integer.valueOf(data);
                                i.setQuantity(intData);
                                i.multiplyPrice();
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

    public void deleteItem(int setCategory, String idItem){
        switch (setCategory) {
            case 1:
                Iterator<Product> it1 = products.iterator();
                while(it1.hasNext()) {
                    Product i = it1.next();
                    if(i.getIdItem() == idItem) {
                        it1.remove();
                    }
                }
                break;

            case 2:
                Iterator<Service> it2 = services.iterator();
                while(it2.hasNext()) {
                    Service i = it2.next();
                    if(i.getIdItem() == idItem) {
                        it2.remove();
                    }
                }
                break;
        
            default:
                System.out.println("Escolha a categoria");
                break;
        }
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
