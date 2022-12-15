import model.*;
import control.*;

public class App {
    public static void main(String[] args) {
        
        ControllerUser ctrluser = new ControllerUser();
        
        User user = new User();
        User user1 = new User();
        
        user.setName("Joao");
        user.setEmail("joao@email.com");
        user.setId("123124235");
        ctrluser.createUser(user);

        user1.setName("pedro");
        user1.setEmail("pedro@email.com");
        user1.setId("00000000");
        ctrluser.createUser(user1);

        ctrluser.readUser("00000000");
        ctrluser.updateUser(user, "00000000", 0);
        ctrluser.deleteUser(user, "123124235");
        ctrluser.readUsers();

        ControllerBudget ctrlbud = new ControllerBudget();
        Budget bud = new Budget();

        bud.setTitle("Carro");
        bud.setDescription("Miniaturas diecast");
        bud.setProduct(true);
        bud.setQtd_product(2);
        bud.setNameUser("pedro");
        bud.setIdUser("00000000");
        bud.setPrice(50000);
        bud.multiplyPrice();

        ctrlbud.createBudget(bud);
        ctrlbud.readBudget("00000000");
        ctrlbud.updateBudget(bud, "Novo titulo", 1);
        ctrlbud.deleteBudget(bud, "00000000");
        ctrlbud.readBudgets();
    }
}
