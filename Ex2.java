package DZ2;

import java.io.*;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        try {
            File file = new File("file2.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();

            String[] arr = line.replace("{", "").replace("}", "").replace("[", "")
                    .replace("]", "").replace("\"", "")
                    .replace(":", ",").replace(" ", "").split(",");
                    
            StringBuilder key = new StringBuilder();
            for (int i = 1, j = 3, q = 5; i < arr.length; i += 6, j += 6, q += 6) {
                key.append("Студент " + arr[i] + " получил " + arr[j] + " по предмету " + arr[q]);
                System.out.println(key);
                key.setLength(0);
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}