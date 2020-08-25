package InputTypes;

import java.util.Scanner;
import userexception.CustomException;

public class ScannerEx {

	public static void main(String[] args) throws CustomException {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your name:");
			String stringInput = scan.next();
			System.out.println("Hi " + stringInput + " , welcome to this tutorial");
			
			System.out.println("Enter your Age:");
			int intInput = scan.nextInt();
			System.out.println("My age: " + intInput);
		}
		catch(Exception ex)
		{
			System.out.println("some error");
			throw new CustomException(ex.getLocalizedMessage());
		}
	}

}
