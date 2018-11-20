package Courses;

import Users.Student;

import java.io.Serializable;
import java.util.HashMap;

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
}
