package Users;

public class Admin extends User {
    public Admin(String login, String password) {
        super(login, password);
    }

    @Override
    public void execute(int value) {
        if (value == 1) { // Remove a user

        }
        if (value == 2) { // Add a user

        }
        if (value == 3) { // See log files

        }
        if (value == 4) { // Update info about a user

        }
    }

}
