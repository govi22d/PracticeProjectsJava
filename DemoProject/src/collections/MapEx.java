package collections;
import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		//
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); //treat object in key value pair, 
		hm.put(1,  "one");
		hm.put(3, "three");
		hm.put(2, "two");
		System.out.println(hm);
		
			
		//
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(); //maintains order data inserted
		lhm.put(1,  "one");
		lhm.put(3, "three");
		lhm.put(2, "two");
		System.out.println(lhm);
		
		//
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(); //maintains order data inserted
		tm.put(1,  "one");
		tm.put(3, "three");
		tm.put(2, "two");
		System.out.println(tm);
	}

}
