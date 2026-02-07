package module_02.pw;

public class User {
    private String name;
    private String email;
    private String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void update(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
