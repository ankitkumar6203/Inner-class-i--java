package Inner_class;
//Everything else is clear. can you please explain why static is not allowed in Inner once again?
class Outer1
{
	class Inner
	{
		public void m1()//because static method will run without inner object creation 
		{
			System.out.println("Inside Inner class m1()");
		}
	}
}

public class Test {

	public static void main(String[] args) {
		
		new Outer1().new Inner().m1();

	}

}
