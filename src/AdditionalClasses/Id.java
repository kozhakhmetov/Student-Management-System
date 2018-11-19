package AdditionalClasses;

public class Id {
    private int cnt_teacher, cnt_student,cnt_course,cnt_stuff;
    public void load_data() {

    }
    public String calcStudentId() {
        load_data();
        String res = "";
        res += "STUDENT" + (++ cnt_student);
        return res;
    }
    public String calcTeacherId() {
        load_data();
        String res = "";
        res += "TEACHER" + (++ cnt_teacher);
        return res;
    }
    public String calcCourseId() {
        load_data();
        String res = "";
        res += "COURSE" + (++ cnt_course);
        return res;
    }
    public String calcStuffId() {
        load_data();
        String res = "";
        res += "STUFF" + (++ cnt_stuff);
        return res;
    }
}
