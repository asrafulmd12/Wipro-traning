package assignment_day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) throws IOException {
        File f1 = new File("sample.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text to append:");
        String a = sc.nextLine();   

        try (FileWriter fr = new FileWriter(f1, true)) {  
            fr.write(a); 
        }

        sc.close();
    }
}