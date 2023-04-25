public class Q1_ArrayIndexOutOfBounds {
    public static void main(String[] args)
    {
        int ar[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(ar[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
