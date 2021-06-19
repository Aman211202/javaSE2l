package bitlab.askar.module2.lesson5;

import java.io.Serializable;

public class User implements Serializable {
    int id;
    String login;
    String password;

    public User() {
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

}
