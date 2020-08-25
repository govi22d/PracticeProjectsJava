package string.example;

public class StringEx {

	public static void main(String[] args) {
		String str = new String("welcome");
		String str1 = new String("welcome");
		
		String str2 = "welcome";
		String str3 = "welcome";
		
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
	}

}
