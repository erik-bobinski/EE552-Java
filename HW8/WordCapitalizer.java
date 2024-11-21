import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordCapitalizer {

    // read input file lines, call capitalizeWords() and send lines to output file
    public static void capitalizeWordsFromFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String capitalizedLine = capitalizeWords(line);
                writer.write(capitalizedLine);
                writer.newLine();
            }

            // Input file doesn't exist
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }

    // 
    private static String capitalizeWords(String line) {
        StringBuilder capitalized = new StringBuilder();

        // split by whitespace
        String[] words = line.split("\\s+");

        // iterate string array, capitalize first char per element
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }

        return capitalized.toString().trim();
    }
    
    // test implementation in main
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        capitalizeWordsFromFile(inputFile, outputFile);
        System.out.println("Program closing, check " + outputFile + " in working directory...");
    }
}