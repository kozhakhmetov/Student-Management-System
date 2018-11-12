package Users;

import Enums.Title;

public class Teacher extends Employee {
    private String teacher_id;
    public Teacher(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(name,surname,phoneNumber,email,login,password,title,salary);
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }
}
