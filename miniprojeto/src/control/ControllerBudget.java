package control;

import java.util.HashSet;
import model.Budget;

public class ControllerBudget {
    private HashSet<Budget> budgets;

    public ControllerBudget() {
        budgets = new HashSet<Budget>();
    }

    public void createBudget(Budget budget){
        budgets.add(budget);
    }
    
    public void readBudgets(){
        for (Budget i : budgets){
            System.out.println(i);
        }
    }

    public void readBudget(String idUser){
        for (Budget o : budgets){
            if (o.getIdUser() == idUser){
                System.out.println(o);
            }
        }
    }

    public void updateBudget(Budget budget, String data, int setAt ){
        for (Budget o : budgets){
            if (o == budget){
                switch (setAt) {
                    case 1:
                        o.setTitle(data);
                        break;
                    
                    case 2:
                        o.setDescription(data);
                        break;

                    case 3:
                        o.setNameUser(data);
                        break;

                    case 4:
                        o.setIdUser(data);
                        break;

                    case 5:
                        if (o.isProduct() == true){
                            o.setProduct(false);
                        } else {
                            o.setProduct(true);
                        }
                        break;
                    
                    case 6:
                        int intData = Integer.valueOf(data);
                        o.setQtd_product(intData);
                        o.multiplyPrice();
                        break;

                    case 7:
                        double doubleData = Double.valueOf(data);
                        o.setPrice(doubleData);
                        o.multiplyPrice();
                        break;

                    default:
                        System.out.println("Nada alterado");
                        break;
                }
            }
        }
    }

    public void deleteBudget(Budget budget, String idUser){
        if (budget.getIdUser() == idUser){
            budgets.remove(budget);
        }
    }
}
