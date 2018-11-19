package Users;

import AdditionalClasses.PersonData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher extends Employee {
    private List<String> courses;

    public Teacher(PersonData personData) {
        super(personData);
        courses = new ArrayList<String>();
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

        }
        if (value == 6) { // Send order to IT support guy
            String order = scanner.nextLine();
            TechSupport.getOrders(order);
        }
    }


}
