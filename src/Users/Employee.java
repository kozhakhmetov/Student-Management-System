package Users;

import AdditionalClasses.PersonData;
import Enums.Degree;
import Enums.Title;

public abstract class Employee extends User {
    private PersonData data;
    private Title title;

    private int salary;
    private int employeeID;

    public Employee(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(login,password);
        data = new PersonData(name, surname, phoneNumber, email);
        this.title = title;
        this.salary = salary;
    }

    public PersonData getData() {
        return data;
    }

    public void setData(PersonData data) {
        this.data = data;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public abstract void execute(int value);
}
