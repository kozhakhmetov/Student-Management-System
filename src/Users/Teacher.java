package Users;

import Courses.Course;
import Enums.Title;

import java.util.List;
import java.util.Scanner;

public class Teacher extends Employee {
    private String teacherId;
    private List<String> courses;
    private List<String> messages;

    public Teacher(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(name,surname,phoneNumber,email,login,password,title,salary);
    }

    @Override
    public void execute(int value) {
        Scanner scanner = new Scanner(System.in);
        if (value == 1) { // Add a course
            String courseId = scanner.nextLine();
            courses.add(courseId);
        }
        if (value == 2) { // View courses
            for(String courseId : courses) {
                System.out.println(courseId);
            }
        }
        if (value == 3) { // Edit courseFile

        }
        if (value == 4) { // Put marks

        }
        if (value == 5) { // View messages from ORManager
            for(String message : messages) {
                System.out.println(message);
            }
            messages.clear();
        }
        if (value == 6) { // Send order to IT support guy
            String order = scanner.nextLine();
            TechSupport.getOrders(order);
        }
    }

    public void sendMessage(String message) {
        messages.add(message);
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
