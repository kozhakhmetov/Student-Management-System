package Users;

import AdditionalClasses.PersonData;
import Enums.Degree;

public class Student extends User {

    private int studentID;
    private Degree degree;

    public Student(String name, String surname, String phoneNumber, String email, String login, String password,Degree degree) {
        super(name,surname,phoneNumber,email,login,password);
        this.degree = degree;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
