import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WordCount <input_file>");
            return;
        }

        String filename = args[0];
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); 
                 wordCount += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Total number of words in the file: " + wordCount);
    }
}
