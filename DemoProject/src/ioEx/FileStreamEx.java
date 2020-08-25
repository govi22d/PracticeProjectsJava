package ioEx;
import java.io.*;
public class FileStreamEx {

	public static void main(String[] args) throws IOException {
		WriteFile();
		ReadFile();
		WriteFileUsingFileWriter();
	}
	
	public static void ReadFile() throws IOException
	{
		
		var fi = new FileInputStream("test.txt");
		fi.read();
		System.out.println("ReadFile: " +fi.read());
		
		int i = 0;
		while((i = fi.read())!= -1)
		{
			System.out.print((char)i);
		}
		fi.close();
	}
	
	public static void WriteFile() throws IOException
	{
		
		var fo = new FileOutputStream("test.txt");
		String str = "testinf file output";
		fo.write(str.getBytes());
		System.out.println("WriteFile:created and updated file.");
		fo.close();
	}
	
	public static void WriteFileUsingFileWriter() throws IOException
	{
		
		var fw = new FileWriter("test1.txt");
		String str = "testint file output using file writer";
		fw.write(str);
		fw.close();
		System.out.println("\nWriteFileUsingFileWriter:created and updated file test1.");
	}

}
