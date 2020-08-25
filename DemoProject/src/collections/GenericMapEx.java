package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GenericMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); //treat object in key value pair, 
		hm.put(1,  "mango");		//so key can't be duplicate
		hm.put(1,  "apple");
		hm.put(4, "barry");
		hm.put(2,  "orange");
		
		System.out.println(hm);
		
		//Collection c = hm.values();
		
		Set<Integer> s = hm.keySet();
		Iterator<Integer> it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(var m:hm.entrySet())
		{
			System.out.println(m);
		}
		
	}

}
