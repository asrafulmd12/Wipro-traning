package assignment_day10;
import java.io.*;

public class Problem4 {
    public static void main(String[] args) throws IOException {

        File file = new File("Text1.txt");
        String target = "Java";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {

                // Split line into words (space, comma, punctuation)
                String[] words = line.split("[^a-zA-Z]+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }
        }

        System.out.println("Occurrences of '" + target + "': " + count);
    }
}