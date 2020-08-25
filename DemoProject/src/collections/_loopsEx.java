package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class _loopsEx {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Rohit", 12));
		al.add(new Student("Shams", 11));
		al.add(new Student("Arun", 14));
		al.add(new Student("Deep", 13));
		
		
		for(Student str : al)							// for loop
		{
			System.out.println(str.getName());
		}
		
		al.forEach(x-> System.out.println(x.getName())); //Lambda expression
		al.forEach(System.out :: println); 				//References
		
		Iterator<Student> it = al.iterator();			//iterator
		while(it.hasNext())
		{
			Student std = (Student)it.next();
			System.out.println("name: "+ std.getName());
			System.out.println("name: "+ std.getAge());
		}
		
	}

}
 
class Student
{
	private String name;
	private int age;
	
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}