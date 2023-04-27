import java.io.*;

public class FileHandling {
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		int ch;
		
		try {
			reader = new FileReader("source.txt");
			writer = new FileWriter("destination.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error in opening file");
		}
		
		try {
			while((ch = reader.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			System.out.println("Error reading file");
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				System.out.println("Error closing file");
			}
		}
	}
}