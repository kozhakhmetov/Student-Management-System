package DataAndStatickClasses;


import Users.*;
import javafx.scene.input.KeyCode;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Session {
    static String mainPath = "/Users/mac/Projects/Student-Management-System/src/ActionTreeText";

    static public void start() {
        /*if (user instanceof Admin) mainPath += "/Admin";
        if (user instanceof Teacher) mainPath += "/Teacher";
        if (user instanceof ORManager) mainPath += "/ORManager";
        if (user instanceof Student) mainPath += "/Student";
        if (user instanceof TechSupport) mainPath += "TechSupportGuy";*/
        Scanner sc = new Scanner(System.in);
        NavigationTree navigationTree = new NavigationTree(mainPath);
        navigationTree.print();
        while (true) {
            int key = read(sc);
            if (key == 0) continue;
            if (key == 1) navigationTree.decIndex();
            if (key == 2) navigationTree.incIndex();
            if (key == 3) navigationTree.getParent();
            if (key == 4) navigationTree.getDown();
            int executionValue = navigationTree.execute();
            if (executionValue == 0) return;
            if (executionValue != -1) {
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
