package assignment_day10;
import java.io.*;

public class Problem3 {
    public static void main(String[] args) throws IOException {

        File file = new File("Text1.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("java")) {  
                    System.out.println(line);
                }
            }
        }
    }
}
