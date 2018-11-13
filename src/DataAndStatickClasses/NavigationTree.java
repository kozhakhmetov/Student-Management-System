package DataAndStatickClasses;

import java.io.File;
import java.io.IOException;

public class NavigationTree {

    private File mainFile;
    private int index;
    private int length;

    public NavigationTree(File mainFile) {
        this.mainFile = mainFile;
        this.length = getLengthWithoutHidden();
        this.index = 0;
    }

    public void init(File mainFile) {
        this.mainFile = mainFile;
        this.length = getLengthWithoutHidden();
        this.index = 0;
    }

    static void printYellow(String string) {
        System.out.println(String.format("\033[33m%s\033", string));
    }
    static void printGreen(String string) {
        System.out.println(String.format("\033[32;1;2m%s\033", string));
    }

    public void incIndex() {
        index++;
        if (length == index) index = 0;
    }

    public void decIndex() {
        index--;
        if (index == -1) index = length - 1;
    }

    public void print() {
        clearScreen();
        int cnt = 0;
        for (File fileEntry : mainFile.listFiles()) {
            if(!fileEntry.isHidden()){
                if (cnt++ == index) {
                    printYellow(fileEntry.getName());
                }else {
                    printGreen(fileEntry.getName());
                }
            }
        }
    }

    private static void clearScreen() {
        try {
            Runtime.getRuntime().exec("clear");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void getDown() {
        int cnt = 0;
        for(File fileEntry : mainFile.listFiles()) {
            if (fileEntry.isHidden()) continue;
            if (cnt++ == index) {
                init(fileEntry);
                return;
            }
        }
    }

    private int getLengthWithoutHidden() {
        int cnt = 0;
        for(File fileEntry : mainFile.listFiles()) {
            if(fileEntry.isHidden()) continue;
            cnt++;
        }
        return cnt;
    }

    public void getParent() {
        init(mainFile.getParentFile());
    }
}
