package Courses;

import Users.Student;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public class Mark implements Serializable, Cloneable, Comparable {

    String course_name;
    Student student;
    int mark;

    public Mark(Student student, int mark, String course_name) {
        this.student = student;
        this.mark = mark;
        this.course_name = course_name;
    }

    public void setMark(Integer mark_) {
        Transcript transcript = student.getTranscript();
        HashMap<String,Integer> hs = transcript.getMarks();
        hs.put(course_name,(Integer)mark_);
        transcript.setMarks(hs);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark1 = (Mark) o;
        return mark == mark1.mark &&
                Objects.equals(course_name, mark1.course_name) &&
                Objects.equals(student, mark1.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course_name, student, mark);
    }

    @Override
    public String toString() {
        return "Mark{" +
                "course_name='" + course_name + '\'' +
                ", student=" + student +
                ", mark=" + mark +
                '}';
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
