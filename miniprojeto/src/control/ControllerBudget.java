package control;

import java.util.ArrayList;
import java.util.Iterator;
import model.*;

public class ControllerBudget {
    private ArrayList<Budget> budgets;
    //private ArrayList<Product> products;
    //private ArrayList<Service> services;

    public ControllerBudget() {
        this.budgets = new ArrayList<Budget>();
        //this.products = new ArrayList<Product>();
        //this.services = new ArrayList<Service>();
    }

    public Budget createBudget(String id, String title, ArrayList<Product> products, ArrayList<Service> services, String idUser,
    String name, String email){
        Budget budget = new Budget(id, title, products, services, idUser, name, email);
        this.budgets.add(budget);
        return budget;
    }

    public String readBudget(String idUser){
        
        String str = "";
        for (Budget o : this.budgets){
            if (o.getUser().getId() == idUser){
                str = String.valueOf(o);
            }
        }
        return str;
    }

    public void updateBudget(String idUser, String data, int setAt ){
        for (Budget o : this.budgets){
            if (o.getUser().getId() == idUser){
                switch (setAt) {
                    case 1:
                        o.setTitle(data);
                        break;
                    
                    case 2:
                        o.setId(data);
                        break;

                    default:
                        System.out.println("Nada alterado");
                        break;
                }
            }
            break;
        }
    }

    public void deleteBudget(String idUser){
        Iterator<Budget> it = budgets.iterator();
        while(it.hasNext()) {
            Budget i = it.next();
            if(i.getUser().getId() == idUser) {
                it.remove();
            }
        }
    }
}
