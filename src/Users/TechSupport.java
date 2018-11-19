package Users;

import Enums.Title;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechSupport extends Employee {
    public static List<String> orders = new ArrayList<String>();
    public TechSupport(String name, String surname, String phoneNumber, String email, String login, String password, Title title, int salary) {
        super(name, surname, phoneNumber, email, login, password, title, salary);
    }

    @Override
    public void execute(int value) {
        Scanner scanner = new Scanner(System.in);
        String order;
        if (value == 1) { // Accept orders
            orders.clear();
        }
        if (value == 2) { // View new orders
            for(String curOrder : orders) {
                System.out.println(curOrder);
            }
        }
    }

    public static void getOrders(String order) {
        orders.add(order);
    }

}
