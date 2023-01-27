package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.*;

/**
 * Classe ControllerBudget cria uma nova instancia para manipular dados do orcamento.
 * Somente os metodo createUser() e updatePrice tem conexao com a interface grafica.
 * @param budgets -> ArrayList que armazena objetos do tipo Budget (sem conexao com a interface grafica)
 * @author Pedro Eduardo Santos Sousa
 */

public class ControllerBudget {
    private ArrayList<Budget> budgets;
    
    public ControllerBudget() {
        this.budgets = new ArrayList<Budget>();
    }

    /**
     * Cria um novo orçamento.
     * @param id
     * @param title
     * @param products
     * @param services
     * @param idUser
     * @param name
     * @param email
     * @return Budget
     */
    public Budget createBudget(
    String id,
    String title,
    ArrayList<Product> products,
    ArrayList<Service> services,
    String idUser,
    String name,
    String email) {
        Budget budget = new Budget(id, title, products, services, idUser, name, email);
        this.budgets.add(budget);
        return budget;
    }

    /**
     * Imprime determinado orçamento com base no parâmetro idUser.
     * @param idUser
     */
    public void readBudget(String idUser){
        for (Budget o : this.budgets){
            if (o.getUser().getId() == idUser){
                System.out.println(o);
            }
        }
    }

    /**
     * Deleta determinado usuário com base no parâmetro idUser.
     * @param idUser
     */
    public void deleteBudget(String idUser){
        Iterator<Budget> it = budgets.iterator();
        while(it.hasNext()) {
            Budget i = it.next();
            if(i.getUser().getId() == idUser) {
                it.remove();
            }
        }
    }

    /**
     * Atualiza o preço total do orçamento com base nos produtos e serviços.
     * @param listServices
     * @param listProducts
     * @return double
     */
    public double updatePrice(ArrayList<Service> listServices, ArrayList<Product> listProducts){
        double totalPrice = 0;
        for (Product i : listProducts){
            totalPrice += (i.getPrice() * i.getQuantity());
        }
        for (Service i : listServices){
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }
}