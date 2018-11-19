package DataAndStatickClasses;


import Users.*;
import javafx.scene.input.KeyCode;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Session {
    static final String mainPath = "/Users/mac/Projects/Student-Management-System/src/ActionTreeText";

    static public void start(User user) {
        String path = mainPath;
        if (user instanceof Admin) path += "/Admin";
        if (user instanceof Teacher) path += "/Teacher";
        if (user instanceof ORManager) path += "/ORManager";
        if (user instanceof Student) path += "/Student";
        if (user instanceof TechSupport) path += "/TechSupportGuy";
        Scanner sc = new Scanner(System.in);
        NavigationTree navigationTree = new NavigationTree(path);
        navigationTree.print();
        while (true) {
            int key = read(sc);
            if (key == 0) continue;
            if (key == 1) navigationTree.decIndex();
            if (key == 2) navigationTree.incIndex();
            if (key == 3) navigationTree.getParent();
            if (key == 4) navigationTree.getDown();
            int executionValue = navigationTree.execute();
            System.out.print(executionValue);
            if (executionValue == 0) {
                return;
            }
            if (executionValue != -1) {
                navigationTree.getParent();
                //user.execute(executionValue);
            }

            navigationTree.print();
        }



    }

    public static void clearScreen() {
        for(int i = 0; i < 100; i++) System.out.println();
    }

    static public int read(Scanner scanner) {
        String string = scanner.next();
        if (string.equals("w")) return 1;
        if (string.equals("s")) return 2;
        if (string.equals("a")) return 3;
        if (string.equals("d")) return 4;
        return 0;
    }


}
