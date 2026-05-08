package io_Filehandling;
import java.io.*;
import java.util.*;

public class Pr3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("demo.txt"));

        List<String> lines = new ArrayList<>();
        String line;

        // Step 1: read file normally and store in list
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        br.close();

        // Step 2: print from last to first
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}