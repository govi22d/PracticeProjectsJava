package string.example;

public class stringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("welcome buffer");
		sb.append("1");
		sb.append("2");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("welcome builder");
		sb1.append("1");
		sb1.append("2");
		System.out.println(sb1);
		
		//string buffer are synchronized but builder is not. but both are mutable 
	}

}
