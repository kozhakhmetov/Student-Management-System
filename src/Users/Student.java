package Users;

import AdditionalClasses.PersonData;
import Enums.Degree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends User {

    private Degree degree;
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
