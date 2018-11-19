package Users;

import AdditionalClasses.PersonData;
import DataAndStatickClasses.Data;

import java.io.IOException;
import java.util.Scanner;

public class Admin extends User {
    static private final String enterLogin = "Enter the login of user";
    static private final String wrongLogin = "User with such login does not exist";
    static private final String end = "Enter ! sign to exit";


    public Admin(String login, String password) {
        super(login, password);
    }

    @Override
    public void execute(int value) {
        if (value == 1) { // Remove a user
            Scanner scan = new Scanner(System.in);
            String login = scan.nextLine();
            if (login.equals("!")) return;
            while (!Data.doesUserExist(login)) {
                System.out.println(wrongLogin);
                System.out.println(enterLogin);
                login = scan.nextLine();
                if (login.equals("!")) return;
            }
            try {
                Data.deleteUser(login);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (value == 2) { // Add a Student
            PersonData personData = new PersonData();
            if (!personData.setName()) return;
            if (!personData.setSurname()) return;
            if (!personData.setEmail()) return;
            if (!personData.setNumber()) return;
            Student newStudent = new Student(personData);
            if (!newStudent.setLogin()) return;
            if (!newStudent.setPassword()) return;
            Data.addUser(newStudent);
        }
        if (value == 3) { // See log files

        }
        if (value == 4) { // Update info about a user

        }
    }

}
