import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream reader = null;
        FileOutputStream writer = null;

        try {
            reader = new FileInputStream("test.txt");
            writer = new FileOutputStream("test2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        try {
            while(reader.read() != -1) {
                writer.write((char)reader.read());
            }
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } finally {
            try {
                reader.close();
                writer.close();
                System.out.println("File contents copied successfully");
            } catch (IOException e) {
                System.out.println("Error in closing files");
            }
        }
    }
}
