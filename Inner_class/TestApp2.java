package Inner_class;
// Anonymous inner class that implements an interface
public class TestApp2 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				//logic for the thread
				
			}
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println(r.getClass().getName());
		

	}

}
