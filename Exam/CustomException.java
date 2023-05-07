import java.util.Scanner;
public class CustomException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        try {
            if (0 <= num && num <= 100) 
                System.out.println("Valid number");
            else 
                throw new InvalidNumberException("The input number is invalid");
        } catch (InvalidNumberException e) {
            System.err.println(e);
        }
    }
}

class InvalidNumberException extends Exception {
    InvalidNumberException(String message) {
        super(message);
    }
}
