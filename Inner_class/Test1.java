package Inner_class;
// Method local inner class

//We can define general method outside the m2 method and we call it inside the m2 method

public class Test1 {
	
	public void m2()
	{
		class Inner
		{
			public void sum(int a, int b)
			{
				System.out.println("Sum of a and b : "+(a+b));
			}
		}
		
		new Inner().sum(10, 20);
	}

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.m2();

	}

}
