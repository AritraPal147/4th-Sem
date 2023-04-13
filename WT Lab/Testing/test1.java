import java.util.Scanner;
class test1{
    public static void main(String[] args) {
        Null obj = new Null();
        try {
            System.out.println(obj.message( null));
        } catch(NullPointerException e) {
            System.out.println(e);
        }
    }
}

class Null {
    public static Null initState() {
        return null;
    }

    String message(String str) {
        return str.toUpperCase();
    }
}