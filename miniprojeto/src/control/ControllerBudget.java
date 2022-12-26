package control;

import java.util.HashSet;
import model.Budget;

public class ControllerBudget {
    private HashSet<Budget> budgets;

    public ControllerBudget() {
        this.budgets = new HashSet<Budget>();
    }

    public void createBudget(Budget budget){
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

    public void updateBudget(Budget budget, String data, int setAt ){
        for (Budget o : this.budgets){
            if (o == budget){
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

    public void deleteBudget(Budget budget, String idUser){
        if (budget.getUser().getId() == idUser){
            this.budgets.remove(budget);
        }
    }
}
