package Courses;

import Users.Student;

import java.io.Serializable;

public class Mark implements Serializable, Cloneable, Comparable {
    Student student;
    char mark;

    public Mark(Student student, char mark) {
        this.student = student;
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
