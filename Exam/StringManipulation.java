import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // A) Display string in uppercase
        String upperCaseString = str.toUpperCase();
        System.out.println("\nUppercase String: " + upperCaseString);

        // B) Find out length of String
        System.out.println("String length: " + str.length());

        // C) Reverse the String
        StringBuffer revString = new StringBuffer(str);
        System.out.println("Reversed String: " + revString.reverse());

        // D) Display substring from 2nd to 5th position
        System.out.println("Required Substring: " + str.substring(2, 5));

        // E) Count the number of vowels in the string
        char[] charArray = str.toLowerCase().toCharArray();
        int countVowels = 0;
        for (char ch: charArray)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                countVowels++;
        System.out.println("Number of Vowels: " + countVowels);

        input.close();
    }
}
