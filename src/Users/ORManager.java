package Users;

import Enums.Title;

public class ORManager extends Employee {
    private String id;

    public ORManager(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(name,surname,phoneNumber,email,login,password,title,salary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
