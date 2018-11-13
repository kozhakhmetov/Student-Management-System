package Users;

import Enums.Title;

public class TechSupport extends Employee {

    public TechSupport(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(name, surname, phoneNumber, email, login, password, title, salary);
    }
}
