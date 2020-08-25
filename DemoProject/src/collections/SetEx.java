package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(); // can add similar datatype's data
		ts.add("mango");			// no duplicate
		ts.add("mango");
		ts.add("apple");
		ts.add("orange");
		System.out.println(ts);
		
		//
		HashSet<String> hs = new HashSet<String>(); //doesn't allow duplicate data but all lists does
		hs.add("mango");			//and doesnt store data in sequence
		hs.add("mango");
		hs.add("apple");
		hs.add("orange");
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(); //doesn't allow duplicate data but all lists does
		lhs.add("mango");			//and stores data in sequence
		lhs.add("mango");			//set doesn't allow duplicate
		lhs.add("apple");
		lhs.add("orange");
		
		System.out.println(lhs);
	}

}
