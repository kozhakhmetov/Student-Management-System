package Users;

import Enums.Title;

public class ORManager extends Employee {
    private String id;

    public ORManager(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(name,surname,phoneNumber,email,login,password,title,salary);
    }

    @Override
    public void execute(int value) {
        if (value == 1) { // View info about a student

        }
        if (value == 2) { // Add a course

        }
        if (value == 3) { // Send a message to the teachers

        }
        if (value == 4) { // View info about a teacher

        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
