public class User {
    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public void helloUser(){
        System.out.println("Hello I am: " + this.name);
    }

    }











