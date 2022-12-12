package model;

public class User {
    private String name;
    private String email;
    private String id;
    
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


    // Methods
    @Override
    public String toString(){
        return "Nome: "+this.name+", Email: "+this.email+", Id: "+this.id;
    }
}