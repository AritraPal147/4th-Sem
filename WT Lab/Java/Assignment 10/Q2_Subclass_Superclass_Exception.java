public class Q2_Subclass_Superclass_Exception {
    
    public static void main(String[] args) {
        try {
           int x = 5/0;
        } catch (ArithmeticException ae) {
           System.out.println("Caught ArithmeticException: " + ae.getMessage());
        } catch (Exception e) {
           System.out.println("Caught Exception: " + e.getMessage());
        }
     }
}

