import java.io.*;
import java.util.*;
public class DirectoryCrawler {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("directory or file name, dude?");
        String name = console.nextLine();
        File f = new File(name);
        if (!f.exists()) {
            System.out.println("No such file/directory");
        } else {
            print(f, 0);
        }
    }
    // Prints information for the given file/directory using the
    // given level of indentation
    public static void print(File f, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(f.getName());
        if (f.isDirectory()) {
            for (File subF : f.listFiles()) {
                print(subF, level + 1);
            }
        }
    }
}
