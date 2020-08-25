package InputTypes;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamEx {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DataInputStream inputStream = new DataInputStream(System.in);
		System.out.println("Enter your name:");
		
		try {
			String str = inputStream.readLine();
			System.out.println("My name is:" + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
