package controller;

import java.util.LinkedList;
import java.util.Iterator;
import model.User;

/**
 * Classe ControllerUser cria uma nova instância para manipular dados do usuário.
 * Somente o método createUser() tem conexão com a interface gráfica. 
 * @param users -> LinkedList que armazena objetos do tipo User (sem conexão com a interface gráfica)
 * @author Pedro Eduardo Santos Sousa
 */

public class ControllerUser {
    private LinkedList<User> users;

    public ControllerUser() {
        this.users = new LinkedList<User>();
    }

    
    /** 
     * @return LinkedList<User>
     */
    public LinkedList<User> getUsers() {
        return users;
    }

    
    /** 
     * @param users
     */
    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }

    /**
     * Cria um novo usuário e adiciona em users.
     * @param id
     * @param name
     * @param email
     * @return User
     */
    public User createUser(String id, String name, String email){
        User user = new User(id, name, email);
        this.users.add(user);
        return user;
    }

    /**
     * Imprime determinado usuário com base no parâmetro idUser.
     * @param idUser
     */    
    public void readUser(String idUser){
        for (User o : this.users){
            if (o.getId() == idUser){
                System.out.println(o);
            }
        }
    }

    /**
     * Deleta determinado usuário com base no parâmetro idUser.
     * @param idUser
     */
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
