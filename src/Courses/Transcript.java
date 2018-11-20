package Courses;

import java.util.HashMap;

public class Transcript {

    HashMap<String, Integer> marks = new HashMap<String,Integer>();

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(HashMap<String, Integer> marks) {
        this.marks = marks;
    }
}

