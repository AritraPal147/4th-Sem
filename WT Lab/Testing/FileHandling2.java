import java.io.*;

public class FileHandling2 {
	public static void main(String[] args) {
		String line;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader("source.txt"));
			writer = new BufferedWriter(new FileWriter("destination.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error in reading file");
		}
		
		try {
			while((line = reader.readLine()) != null)
				writer.write(line);
		} catch (IOException e) {
			System.out.println("Error reading file");
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				System.out.println("Error in closing file");
			}
		}
	}
}