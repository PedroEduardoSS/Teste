package control;

import java.util.LinkedList;
import java.util.Iterator;
import model.User;

public class ControllerUser {
    private LinkedList<User> users;

    public ControllerUser() {
        this.users = new LinkedList<User>();
    }

    public LinkedList<User> getUsers() {
        return users;
    }

    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }

    public User createUser(String id, String name, String email){
        User user = new User(id, name, email);
        this.users.add(user);
        return user;
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

    public void updateUser(String idUser, String data, int setAt){
        for (User o : this.users){
            if (o.getId() == idUser){
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

    public void deleteUser(String idUser){
        Iterator<User> it = users.iterator();
        while(it.hasNext()) {
            User i = it.next();
            if(i.getId() == idUser) {
                it.remove();
            }
        }
    }
}
