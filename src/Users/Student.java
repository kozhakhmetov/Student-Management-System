package Users;

import AdditionalClasses.PersonData;
import Enums.Degree;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Student extends User {

    private String studentID;
    private Degree degree;
    private PersonData personData;
    private double gpa;
    private List<String> courses;

    public Student(String name, String surname, String phoneNumber, String email, String login, String password, Degree degree, double gpa) {
        super(login, password);
        personData = new PersonData(name, surname, phoneNumber, email);
        this.degree = degree;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public void execute(int value) {
        Scanner scanner = new Scanner(System.in);
        if (value == 1) { // View courses
            for(String curCourse : courses) {
                System.out.println(curCourse);
            }
        }
        if (value == 2) { // View transcript
            // take information from Course, waiting for Adilkhan
        }
        if (value == 3) { // Register for a course
            String courseid = scanner.nextLine();
            courses.add(courseid);
        }
        if (value == 4) { // View marks for a specific course
            // take information from Course, waiting for Adilkhan

        }
        if (value == 5) { // View file of course
            // take information from Course, waiting for Adilkhan
        }


    }
}
