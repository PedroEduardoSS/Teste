package control;

import java.util.HashSet;
import java.util.Iterator;
import model.Budget;

public class ControllerBudget {
    private HashSet<Budget> budgets;

    public ControllerBudget() {
        this.budgets = new HashSet<Budget>();
    }

    public void createBudget(){
        Budget budget = new Budget();
        this.budgets.add(budget);
    }
    
    public void readBudgets(){
        for (Budget i : this.budgets){
            System.out.println(i);
        }
    }

    public void readBudget(String idUser){
        for (Budget o : this.budgets){
            if (o.getUser().getId() == idUser){
                System.out.println(o);
            }
        }
    }

    public void updateBudget(String idUser, String data, int setAt ){
        for (Budget o : this.budgets){
            if (o.getUser().getId() == idUser){
                switch (setAt) {
                    case 1:
                        o.setTitle(data);
                        break;
                    
                    case 2:
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
