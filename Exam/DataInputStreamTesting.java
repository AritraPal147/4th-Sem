import java.io.*;
public class DataInputStreamTesting {
    public static void main(String args[]) {
        System.out.println("Enter an integer: ");
        DataInputStream dis = new DataInputStream(System.in);
        try {
            int num = dis.readInt();
            FileOutputStream fout = new FileOutputStream("test.txt");
            char ch;
            while ((ch = (char)dis.read()) != '@')
                fout.write(ch);
            fout.close();
            dis.close();
            System.out.println(num);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
