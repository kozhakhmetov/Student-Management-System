package Courses;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public class Transcript implements Cloneable, Serializable, Comparable {

    HashMap<String, Integer> marks = new HashMap<String,Integer>();

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(HashMap<String, Integer> marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transcript that = (Transcript) o;
        return Objects.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "marks=" + marks +
                '}';
    }


}

