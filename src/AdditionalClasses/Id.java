package AdditionalClasses;

public class Id {
    private int cnt_teacher,cnt_student,cnt_course,cnt_stuff;
    public void load_data() {

    }
    public String calc_student_id() {
        load_data();
        String res = "";
        res += "STUDENT" + (++ cnt_student);
        return res;
    }
    public String calc_teacher_id() {
        load_data();
        String res = "";
        res += "TEACHER" + (++ cnt_teacher);
        return res;
    }
    public String calc_course_id() {
        load_data();
        String res = "";
        res += "COURSE" + (++ cnt_course);
        return res;
    }
    public String calc_stuff_id() {
        load_data();
        String res = "";
        res += "STUFF" + (++ cnt_stuff);
        return res;
    }
}
