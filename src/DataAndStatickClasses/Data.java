package DataAndStatickClasses;

import java.util.HashMap;


import Courses.Course;
import Users.Admin;
import Users.User;

public class Data {
    static private HashMap<String, User> logins = new HashMap<String, User>();
    static private HashMap<String, Course> courses = new HashMap<String, Course>();



    public static User getUser(String login) {
        return logins.get(login);
    }

    public static boolean isValid(String login, String password) {
        if (!logins.containsKey(login)) return false;
        return (logins.get(login).isValid(password));
    }

    public static void createAdmin() {
        logins.put("admin", new Admin("admin", "admin"));
    }
}
