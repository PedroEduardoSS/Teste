import model.*;
import control.*;

public class App {
    public static void main(String[] args) {
        
        ControllerUser ctrluser = new ControllerUser();
        
        User user = new User();
        User user1 = new User();
        User user2 = new User();
        
        user.setName("Joao");
        user.setEmail("joao@email.com");
        user.setId("123124235");
        ctrluser.createUser(user);

        user1.setName("pedro");
        user1.setEmail("pedro@email.com");
        user1.setId("00000000");
        ctrluser.createUser(user1);

        user2.setName("maria");
        user2.setEmail("Semnada");
        user2.setId("01010101");
        ctrluser.createUser(user2);

        
        ctrluser.readUsers();
        System.out.println("----------------------");
        ctrluser.deleteUser(user, "123124235");
        ctrluser.readUsers();

       
    }
}
