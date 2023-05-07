import java.io.*;
import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        BufferedReader reader = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of file: ");
        String fileName = input.nextLine();
        try {
            reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        int numOfWords = 0;
        int numOfChars = 0;
        int numOfLines = 0;
        try {
            String str;
            while ((str = reader.readLine()) != null) {
                numOfLines++;
                String[] words = str.split(" ");
                numOfWords += words.length;
                for (String word:words) 
                    numOfChars += word.length() + 1;
            }

            System.out.println("Number of characters: " + numOfChars);
            System.out.println("Number of words: " + numOfWords);
            System.out.println("Number of lines: " + numOfLines);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error in closing file");
            }
        }
    }
}
