package Users;

import AdditionalClasses.PersonData;

public class ORManager extends Employee {

    public ORManager(PersonData personData) {
        super(personData);
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
}
