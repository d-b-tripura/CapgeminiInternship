package multithreading;
import java.io.*;

public class FileProgram {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f = new File("file1.txt");
		f.createNewFile();
		FileWriter f1 = new FileWriter(f);
		f1.write("Hi! How are you and your family doing. I and my family are doing well.");
		f1.close();
		File f2 = new File("file2.txt");
		f2.createNewFile();
		CopyDataThread obj = new CopyDataThread(f,f2);
		
	}

}