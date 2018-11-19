package DataAndStatickClasses;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


import Courses.Course;
import Users.Admin;
import Users.User;

public class Data implements Serializable{
    static private HashMap<String, User> logins = new HashMap<String, User>(); // key: login value: User
    static private HashMap<String, Course> courses = new HashMap<String, Course>(); // key: name of the course value: Course

    public static void saveData() throws IOException { // Serialization data

        FileOutputStream fs = new FileOutputStream("users.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);

        os.writeObject(logins);

        os.flush();
        os.close();
        fs.close();

        fs = new FileOutputStream("courses.ser");
        os = new ObjectOutputStream(fs);

        os.writeObject(courses);

        os.flush();
        os.close();
        fs.close();

    }

    public static void loadData() throws IOException, ClassNotFoundException {
        FileInputStream fs =  new FileInputStream("users.ser");
        ObjectInputStream os = new ObjectInputStream(fs);

        logins = (HashMap) os.readObject();

        os.close();
        fs.close();

        fs = new FileInputStream("courses.ser");
        os = new ObjectInputStream(fs);

        courses = (HashMap) os.readObject();

        os.close();
        fs.close();

    }

    public static boolean doesUserExist(String login) { // check
        return logins.containsKey(login);
    }

    public static boolean doesCourseExist(String name) { // check
        return courses.containsKey(name);
    }

    public static User getUser(String login) { // get User by login TODO try catch
        return logins.get(login);
    }

    public static void deleteUser(String login) throws IOException, ClassNotFoundException { // remove User by login TODO try catch
        logins.remove(login);
        saveData();
    }

    public static Course getCourse(String name) {  // get a course by name TODO try catch
        return courses.get(name);
    }

    public static void deleteCourse(String name) throws IOException, ClassNotFoundException { // remove course by name TODO try catch
        courses.remove(name);
        saveData();
    }

    public static boolean isValid(String login, String password) { // login password validation TODO hash
        if (!logins.containsKey(login)) return false;
        return (logins.get(login).isValid(password));
    }

    public static void createAdmin() {  // Add admin
        logins.put("admin", new Admin("admin", "admin"));
    }
}
