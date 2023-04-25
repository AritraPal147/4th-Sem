import java.util.Scanner;

class InputProcessor {
    public void processInput(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("The input number is negative.");
        } else {
            System.out.println("The double value of the input number is: " + (number * 2));
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q4_CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        scanner.close();

        InputProcessor inputProcessor = new InputProcessor();
        try {
            inputProcessor.processInput(number);
        } catch (NegativeNumberException e) {
            System.err.println(e);
        }
    }
}
