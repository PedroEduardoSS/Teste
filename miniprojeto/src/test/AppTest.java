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
        User user2 = cUser.createUser("000", "Oz", "oz@email.com");
        User user3 = cUser.createUser("000", "oz", "oz@email.com");
        
        try {
            assertEquals(user1, user2);    
        } catch (Exception e) {
            fail("Caso 1: Os usuarios são diferentes");
        }

        try {
            assertEquals(user1, user3);    
        } catch (Exception e) {
            fail("Caso 2: Os usuarios são diferentes");
        }
    }

    @Test
    public void checkCreateBudget(){
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Service> services = new ArrayList<>();
        ArrayList<Product> products1 = new ArrayList<>();
        ArrayList<Service> services1 = new ArrayList<>();
        ArrayList<Product> products2 = new ArrayList<>();
        ArrayList<Service> services2 = new ArrayList<>();
        Budget budget1 = cBudget.createBudget("n1", "orçamento1", products, services, "000", "Oz", "oz@email.com");
        Budget budget2 = cBudget.createBudget("n1", "orçamento1", products1, services1, "000", "Oz", "oz@email.com");
        Budget budget3 = cBudget.createBudget("n1", "orçamento1", products2, services2, "000", "Oz", "oz@email.com");
        
        try {
            assertEquals(budget1, budget2);    
        } catch (Exception e) {
            fail("Caso 3: Os orçamentos são diferentes");
        }

        try {
            assertEquals(budget1, budget3);    
        } catch (Exception e) {
            fail("Caso 4: Os orçamentos são diferentes");
        }
    }

}
/*
assertEquals(vEsp, vRet) 
assertTrue(condition) 
assertFalse(condition) 
assertNull(objeto) 
fail(msg) 
*/
