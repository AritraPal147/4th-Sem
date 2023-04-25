public class Q6_CustomException {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgumentException("At least four arguments required");
            }
            int sumOfSquares = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sumOfSquares += num * num;
            }
            System.out.println("Sum of squares of all arguments: " + sumOfSquares);
        } catch (CheckArgumentException e) {
            System.out.println("Caught CheckArgumentException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }
    }
}


class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
