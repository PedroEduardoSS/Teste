package model;
/**
 * Classe User cria um novo usuario no sistema e recebe
 * tres parametros no construtor.
 * @param id -> String que representa a identificacao do usuario
 * @param name -> String que representa o nome do usuario
 * @param email -> String que representa o email do usuario
 * @author Pedro Eduardo Santos Sousa
 */
public class User {
    private String id;
    private String name;
    private String email;
    
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString(){
        return "Id: "+this.id+", Nome: "+this.name+", Email: "+this.email;
    }
}