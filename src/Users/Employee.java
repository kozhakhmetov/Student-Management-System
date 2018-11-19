package Users;

import AdditionalClasses.IO;
import AdditionalClasses.PersonData;

public abstract class Employee extends User {
    private PersonData data;
    static final String salaryValidation = "[0-9]+";
    static final String salarNotValid = "Salar is not valid";
    static final String enterSalary = "Enter salary";

    private int salary;

    public Employee(PersonData data) {
        super();
        this.data = data;
    }

    public PersonData getData() {
        return data;
    }

    public void setData(PersonData data) {
        this.data = data;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean setSalary() {
        String salary = IO.read();
        if (salary.equals("!")) return false;
        while (!salary.matches(salaryValidation)) {
            IO.print(salarNotValid);
            IO.print(enterSalary);
            salary = IO.read();
            if (salary.equals("!")) return false;
        }
        this.salary = Integer.parseInt(salary);
        return true;
    }

    public abstract void execute(int value);
}
