package assignment_day10;
import java.io.*;

public class Problem1 {
    public static void main(String[] args) throws Exception {

        File file = new File("demo.txt");

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                // Count words
                String[] words = line.split("[\\s,]+"); // split by space or comma
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }
            }
        }
        charCount += lineCount - 1;

        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}