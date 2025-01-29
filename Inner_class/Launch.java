package Inner_class;
class Outer2
{
	int x = 10;   //Instance variable of outer class
	
	class Inner
	{
		int x = 100;  //Instance variable of Inner class
		
		public void m1()
		{
			int x = 1000;  //Instance variable of Inner class method m1()
			System.out.println(x); //1000
			System.out.println(this.x);  //100
			System.out.println(Outer2.this.x);
		}
	}
}
public class Launch {

	public static void main(String[] args) {
		
		System.out.println("main method of outer class");
		new Outer2().new Inner().m1();

	}

}
