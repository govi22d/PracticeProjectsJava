package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListEx {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//
		Vector<Comparable> vl = new Vector<Comparable>();
		vl.add("string");
		vl.add(33);
		vl.add('x');
		vl.add(55.66f);
		vl.set(0, "apple");
		
		System.out.println(vl);
		System.out.println(vl.get(2));
		
		//
		ArrayList<Object> al = new ArrayList<>();
		al.add("string");
		al.add(33);
		al.add('x');
		al.add(55.66f);
		al.set(0, "apple");
		al.add(1, 'c');
		
		System.out.println(al);
		System.out.println(al.get(2));
		
		//
		LinkedList<Comparable> ll = new LinkedList<Comparable>(); //can be traversed forward and backward, 
		ll.add("string1");				//implements set, no duplicate
		ll.add(33);						// ordered based on hashcode
		ll.add('x');
		ll.add(55.66f);
		
		//ll.remove(2);
		ll.set(0, "apple");
		ll.set(1, "mango");
		
		ll.addFirst("Alaska");
		ll.addLast("cantaki");
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll.getLast());
		
		
	}

}
