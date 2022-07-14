package fanfic.sharing.jpmg.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;

    private String username;
    private String password;
    private String email;
    private String role;

    public User(String id, String username, String password, String email, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}