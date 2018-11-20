package Courses;

import Users.Student;
import Users.Teacher;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class Course implements Cloneable, Comparable, Serializable {

    CourseFile courseFile;
    List<Student> students;
    Teacher teacher;
    String courseId;
    int numberOfCredits;
    HashMap<String,Mark> journal = new HashMap<String,Mark>();

    public Course(CourseFile courseFile, Mark marks, List<Student> students, Teacher teacher, String courseId, int numberOfCredits) {
        this.courseFile = courseFile;
        this.marks = marks;
        this.students = students;
        this.teacher = teacher;
        this.courseId = courseId;
        this.numberOfCredits = numberOfCredits;
    }

    public void putMark(String login,int mark_) {

    }

    public CourseFile getCourseFile() {
        return courseFile;
    }

    public void setCourseFile(CourseFile courseFile) {
        this.courseFile = courseFile;
    }

    public Mark getMarks() {
        return marks;
    }

    public void setMarks(Mark marks) {
        this.marks = marks;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public int compareTo(Object o) {
        return 0; // TODO
    }
}
