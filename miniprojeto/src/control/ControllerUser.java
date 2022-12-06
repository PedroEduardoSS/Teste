package control;

import java.util.HashSet;
import model.User;

public class ControllerUser {
    private HashSet<User> users;

    public ControllerUser() {
        users = new HashSet<User>();
    }

    public void createUser(User user){
        users.add(user);
    }

    public void readUsers(){
        for (User i : users){
            System.out.println(i);
        }
    }

    public void readUser(String idUser){
        for (User o : users){
            if (o.getId() == idUser){
                System.out.println(o);
            }
        }
    }

    public void updateUser(User user, String data, int setAt){
        for (User o : users){
            if (o == user){
                switch (setAt) {
                    case 1:
                        o.setName(data);
                        break;
                    
                    case 2:
                        o.setEmail(data);
                        break;
                
                    default:
                        o.setId(data);
                        break;
                }
                System.out.println(o);
            }
        }
    }

    public void deleteUser(User user, String idUser){
        if (user.getId() == idUser){
            users.remove(user);
        }
    }
}
