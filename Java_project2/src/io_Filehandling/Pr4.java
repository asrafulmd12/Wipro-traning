package io_Filehandling;
import java.io.*;

public class Pr4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] words = line.split("\\s+");

            String largestWord = "";

            for (String word : words) {
                if (word.length() > largestWord.length()) {
                    largestWord = word;
                }
            }

            System.out.println("Largest word in line: " + largestWord);
        }

        br.close();
    }
}