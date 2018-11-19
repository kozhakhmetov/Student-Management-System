package Users;

import Enums.Title;

public class TechSupport extends Employee {

    public TechSupport(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(name, surname, phoneNumber, email, login, password, title, salary);
    }

    @Override
    public void execute(int value) {
        if (value == 1) { // Accept orders

        }
        if (value == 2) { // View new orders

        }
    }


}
