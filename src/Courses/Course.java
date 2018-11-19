package Courses;

import Users.Student;
import Users.Teacher;

import java.io.Serializable;
import java.util.List;

public class Course implements Cloneable, Comparable, Serializable {
    CourseFile courseFile;
    Mark marks;
    List<Student> students;
    Teacher teacher;
    String courseId;
    @Override
    public int compareTo(Object o) {
        return 0; // TODO
    }
}
