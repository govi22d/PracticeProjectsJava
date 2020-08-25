package Oops;

public class Outer {

	public static void main(String[] args) {
		//Outer o = new Outer();
		I1 i = new I1.Inner1();
		i.disp();
	}

	interface I1
   {
	   public void disp();
	   class Inner1 implements I1
	   {

		@Override
		public void disp() {
			System.out.println("disp called");
		}
		   
	   }
   }
}
