package Users;

import Courses.Course;
import Enums.Title;

import java.util.List;

public class Teacher extends Employee {
    private String teacherId;
    private List<Course> courses;
    public Teacher(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(name,surname,phoneNumber,email,login,password,title,salary);
    }

    @Override
    public void execute(int value) {
        if (value == 1) { // Add a course

        }
        if (value == 2) { // View courses

        }
        if (value == 3) { // Edit courseFile

        }
        if (value == 4) { // Put marks

        }
        if (value == 5) { // View messages from ORManager

        }
        if (value == 6) { // Send order to IT support guy

        }
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
