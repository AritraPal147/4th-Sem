import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(":");
        int num1 = sc.nextInt();
        sc = null;
        System.out.print(sc);
        sc.close();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.print(":");
        int num2 = sc2.nextInt();
        System.out.print(sc2);

    }
}