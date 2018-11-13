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

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
