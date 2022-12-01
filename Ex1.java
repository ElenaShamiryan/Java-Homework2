package DZ2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] words = line.replace("{", "").replace("}", "")
                    .replace(" ", "").replace(":", ",").replace("\"", "")
                    .split(",");
            scanner.close();

            ArrayList key = new ArrayList<>();
            ArrayList value = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                if (i % 2 == 0)
                    key.add(words[i]);
                else
                    value.add(words[i]);
            }

            System.out.println(key.toString());
            System.out.println(value.toString());

            StringBuilder stringRequest = new StringBuilder();
            stringRequest.append("SELECT * FROM students WHERE ");
            for (int i = 0; i < key.size(); i++) {
                if (!value.get(i).equals("null")) {
                    if (i > 0)
                        stringRequest.append(" AND ");
                    stringRequest.append(key.get(i) + " = " + "\"" + value.get(i) + "\"");
                }
            }
            System.out.print(stringRequest.toString());

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}



    

        
    

 

        
    


