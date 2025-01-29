package Inner_class;
//Anonymous inner class that defined inside method arguments

public class TestApp3 {

	public static void main(String[] args) {
		
		
		new Thread(
				() -> {
					
						for(int i = 1; i<=5; i++)
						{
							System.out.println("child thread");
						}
					}
				
		).start();
				
		for(int i = 1; i<=5; i++)
		{
			System.out.println("Main thread");
		}
	}

}
