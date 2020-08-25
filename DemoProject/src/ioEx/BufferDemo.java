package ioEx;

import java.io.*;
public class BufferDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader be = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter name");
		String name = be.readLine();
		System.out.println("Hi " + name);
	}
}
