package control;

import java.util.HashSet;
import model.Budget;

public class ControllerBudget {
    private HashSet<Budget> budgets;
    //private int qtd_budgets;

    public ControllerBudget() {
        budgets = new HashSet<Budget>();
        //qtd_budgets = 0;
    }

    public void createBudget(Budget budget){
        /*try {
            budgets[qtd_budgets] = budget;
            qtd_budgets ++;
        } catch (Exception e) {
            System.out.println("Número de orçamentos excedido");
        } */
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

    public void updateBudget(Budget budget, String data, int qtd, double price, int setAt ){
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
                        o.setQtd_product(qtd);
                        break;

                    case 7:
                        o.setPrice(price);
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
