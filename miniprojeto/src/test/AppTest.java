package test;

import model.*;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import controller.*;

public class AppTest {
    ControllerBudget cBudget = new ControllerBudget();
    ControllerUser cUser = new ControllerUser();

    @Test
    public void checkCreateUser(){
        User user1 = cUser.createUser("000", "Oz", "oz@email.com");
        User user2 = cUser.createUser("000", "oz", "oz@email.com");
        
        assertNotEquals(user1, user2);
        System.out.println("Sucesso 1: Os usuarios são diferentes");

    }

    @Test
    public void checkCreateBudget(){
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Service> services = new ArrayList<>();
        Budget budget1 = cBudget.createBudget("n1", "orçamento", products, services, "000", "Oz", "oz@email.com");
        Budget budget2 = cBudget.createBudget("n1", "orçamentos", products, services, "000", "Oz", "oz@email.com");
        
        assertNotEquals(budget1, budget2);
        System.out.println("Sucesso 2: Os orçamentos são diferentes");  
        
    }

    @Test
    public void checkUpdatePrice(){
        ArrayList<Product> listProduct = new ArrayList<>(100);
		ArrayList<Service> listService = new ArrayList<>(100);
        listProduct.add(
            new Product("Martelo", "Para construção", 54.99, 2)
        );
        listService.add(
            new Service("Website", "Uma loja virtual", 10000.00, 60)
        );
        ControllerBudget controllerBudget = new ControllerBudget();
        Budget budget = new Budget(
            "01",
            "Orçamento1",
            listProduct,
            listService,
            "001",
            "Turing",
            "turing@email.com"
        );
        budget.setTotalPrice(controllerBudget.updatePrice(listService, listProduct));
        

        assertEquals(budget.getTotalPrice(), 10109.98);
        System.out .println("Sucesso 3: O calculo do updatePrice está certo");  
        
    }

}