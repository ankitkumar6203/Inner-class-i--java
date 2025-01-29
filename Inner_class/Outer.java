package Inner_class;

//sir how in second case that inner class got reference for outer class

public class Outer {
	class Inner
	{
		public void m1()
		{
			System.out.println("Inside Inner class method");
		}
	}
	
	public void m2()
	{
		Inner i = new Inner();//  Inner i = this.new Inner();
		i.m1();
	}

	public static void main(String[] args) {
		
		System.out.println("outer class main method");
		
		//new Outer().new Inner().m1();
		
		Outer o = new Outer();
		o.m2();
	
		

	}

}
