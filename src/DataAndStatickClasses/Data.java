package DataAndStatickClasses;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;


import Courses.Course;
import Users.Admin;
import Users.User;

public class Data {
    static private HashMap<String, User> logins = new HashMap<String, User>();
    static private HashMap<String, Course> courses = new HashMap<String, Course>();


    public void saveData() throws IOException {

        FileOutputStream fs = new FileOutputStream("users.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);

        os.writeObject(logins);
        os.flush();
        os.close();

        fs = new FileOutputStream("courses.set");
        os = new ObjectOutputStream(fs);

        os.writeObject(courses);
        os.flush();
        os.close();

    }

    public static User getUser(String login) {
        return logins.get(login);
    }

    public void deleteUser(String login) {
        for(Map.Entry curUser : logins.entrySet()){
            if(curUser.getKey() == login) {
                logins.remove(curUser);
            }
        }
    }

    public static Course getCourse(String id) {
        return courses.get(id);
    }
    public static void deleteCourse(String id) {
        for(Map.Entry curCourse : courses.entrySet()) {
            if(curCourse.getKey() == id) {
                courses.remove(curCourse);
            }
        }
    }

    public static boolean isValid(String login, String password) {
        if (!logins.containsKey(login)) return false;
        return (logins.get(login).isValid(password));
    }

    public static void createAdmin() {
        logins.put("admin", new Admin("admin", "admin"));
    }
}
