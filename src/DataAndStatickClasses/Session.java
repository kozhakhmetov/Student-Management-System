package DataAndStatickClasses;


import Users.User;
import javafx.scene.input.KeyCode;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Session {
    final static String mainPath = "/Users/mac/Projects/Student-Management-System/src/ActionTreeText";
    final static String main = "Main.txt";
    static public void start() {
        Scanner sc = new Scanner(System.in);


        NavigationTree navigationTree = new NavigationTree(new File(mainPath));
        navigationTree.print();
        navigationTree.print();


    }

    public static void clearScreen() {
        for(int i = 0; i < 100; i++) System.out.println();
    }



}
