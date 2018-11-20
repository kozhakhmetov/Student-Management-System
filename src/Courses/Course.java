package Courses;

import AdditionalClasses.IO;
import DataAndStatickClasses.Data;
import Users.Student;
import Users.Teacher;
import Users.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Course implements Cloneable, Comparable, Serializable {

    static private final String enterLogin = "Enter the login of user";
    static private final String wrongLogin = "User with such login does not exist";

    CourseFile courseFile;
    List<Student> students;
    Teacher teacher;
    String courseId;
    int numberOfCredits;
    List<Mark> marks = new ArrayList<Mark>();

    public Course(CourseFile courseFile, List<Student> students, Teacher teacher, String courseId, int numberOfCredits) {
        this.courseFile = courseFile;
        this.students = students;
        this.teacher = teacher;
        this.courseId = courseId;
        this.numberOfCredits = numberOfCredits;

        for(int i = 0; i < students.size();i ++) {

        }
    }

    public void putMark(String login,Integer mark_) {
        System.out.println(enterLogin);
        login = IO.read();
        if (login.equals("!")) return;
        while (!Data.doesUserExist(login)) {
            System.out.println(wrongLogin);
            System.out.println(enterLogin);
            login = IO.read();
            if (login.equals("!")) return;
        }
        User user = Data.getUser(login);
        if(!(user instanceof Student)) {
            IO.print("User is not student");
        } else {
            Student student = (Student)user;
            HashMap<String,Integer> hs = student.getTranscript().getMarks();
            hs.put(courseId,mark_);
        }
    }

    public CourseFile getCourseFile() {
        return courseFile;
    }

    public void setCourseFile(CourseFile courseFile) {
        this.courseFile = courseFile;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return numberOfCredits == course.numberOfCredits &&
                Objects.equals(courseFile, course.courseFile) &&
                Objects.equals(students, course.students) &&
                Objects.equals(teacher, course.teacher) &&
                Objects.equals(courseId, course.courseId) &&
                Objects.equals(marks, course.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseFile, students, teacher, courseId, numberOfCredits, marks);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseFile=" + courseFile +
                ", students=" + students +
                ", teacher=" + teacher +
                ", courseId='" + courseId + '\'' +
                ", numberOfCredits=" + numberOfCredits +
                ", marks=" + marks +
                '}';
    }


}
