package AdditionalClasses;

import java.util.Scanner;

public class IO {
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        return s;

    }
    public static void print(String s) {
        System.out.println(s);
    }
}
