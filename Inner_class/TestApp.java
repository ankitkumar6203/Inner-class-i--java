package Inner_class;
//Array concept

public class TestApp {

	public static void main(String[] args) {
		
		display(new int[]{10,20,30,40,50});   // because it is static method and present in the same class so there is no need to object create. we can directly call with method name
		//instance use of an object(array)
	};
	
	static void display(int[] a) {
		int sum=0;
		for(int ele:a)
			sum+=ele;
		System.out.println("The sum of an array is :: "+sum);
	}

}
