package model;

public class User {

    private final Long id;
    private String name;
    private String email;
    private final String password;

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.name = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    protected String getPassword() {
        return password;
    }

}
