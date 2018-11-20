package Users;

import AdditionalClasses.PersonData;
import Courses.Transcript;
import Enums.Degree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends User {

    private Degree degree;

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    private Transcript transcript;
    private PersonData personData;
    private double gpa;
    private List<String> courses;

    public Student(PersonData personData) {
        super();
        this.personData = personData;
        this.degree = Degree.Bachelor;
        courses = new ArrayList<String>();
    }

    public Student() {
        super();
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public PersonData getPersonData() {
        return personData;
    }

    public void setPersonData(PersonData personData) {
        this.personData = personData;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
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
        if (value == 3) {

        }
        if (value == 5) { // View file of course
            // take information from Course, waiting for Adilkhan
        }
    }
}
