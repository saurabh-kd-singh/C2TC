package day2;
 
public class MethodOverloading {

	public static void main(String[] args) {
		// We will have multiple methods with same Name but different no. of arguments.
	
		MethodOverloading method = new MethodOverloading();
		
		method.m1(5);
		method.m1(5, 6);
		method.m1(9.9);
		method.m1(5, "Java");
	}

	
//------------------------------------------------------------
	public void m1(int i) 
	{
		System.out.println("Method 1 Overloaded prints : " + i);
	}
//------------------------------------------------------------	
	public void m1(int i, float n) 
	{
		System.out.println("Method 2 Overloaded prints : " + i + " " + n);
	}
//------------------------------------------------------------	
	public void m1(double m) 
	{
		System.out.println("Method 3 Overloaded prints : " + m);
	}
//------------------------------------------------------------
	public void m1(int i, String s) 
	{
		System.out.println("Method 4 Overloaded prints : " + i + " " + s);
	}
//------------------------------------------------------------	
	
}
