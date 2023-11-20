import java.io.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Create a new JFileChooser object to let the user select a file
        JFileChooser fileChooser = new JFileChooser();
        // Show the dialog box and get the user's choice
        int result = fileChooser.showOpenDialog(null);
        if (result != JFileChooser.APPROVE_OPTION) {
            // If the user cancelled, exit the program
            return; // user cancelled
        }
        // Get the selected file and its name
        String fileName = fileChooser.getSelectedFile().getName();
        // Create a BufferedReader to read the file line by line
        BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
        // Initialize counters for lines, words, and characters
        int lines = 0;
        int words = 0;
        int chars = 0;
        String line = null;
        // Read each line of the file and count the lines, words, and characters
        while ((line = reader.readLine()) != null) {
            //Implement lines counter
            lines++;
            // Split the line into words by whitespace and count the number of words
            String[] wordsArray = line.split("\\s+");
            words += wordsArray.length;
            // Count the number of characters in the line
            chars += line.length();
        }
        // Print the summary report to the console
        System.out.println("File name: " + fileName);
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of words: " + words);
        System.out.println("Number of characters: " + chars);
        //Close Reader
        reader.close();

    }