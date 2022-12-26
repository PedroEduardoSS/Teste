package control;

import java.util.HashSet;
import model.User;

public class ControllerUser {
    private HashSet<User> users;

    public ControllerUser() {
        this.users = new HashSet<User>();
    }

    public void createUser(User user){
        this.users.add(user);
    }

    public void readUsers(){
        for (User i : this.users){
            System.out.println(i);
        }
    }

    public void readUser(String idUser){
        for (User o : this.users){
            if (o.getId() == idUser){
                System.out.println(o);
            }
        }
    }

    public void updateUser(User user, String data, int setAt){
        for (User o : this.users){
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
            break;
        }
    }

    public void deleteUser(User user, String idUser){
        if (user.getId() == idUser){
            this.users.remove(user);
        }
    }
}
