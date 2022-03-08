package day2;
import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Creating an object of scanner class.
		
		CalculateArea CalArea = new CalculateArea(); //In order to access the non static method Square
													//of class calculate area inside the static class we need to create an object. 
		
		System.out.println("Choose the option number to calculate the area : ");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		System.out.println("4.Triangle");
		int option = sc.nextInt();
		
		
		switch(option) 
		{
		case 1 : CalArea.Square();
			break;
		case 2 : CalArea.Rectangle();
			break;
		case 3 : CalArea.Circle();
			break;
		case 4 : CalArea.Triangle();
			break;
		default : System.out.println("Invalid Input");
		
		}
		
		sc.close();
	}
	
//-------------------------------------------------------------------------------------	
	
	public void Square() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Side : ");
		double s = sc.nextDouble();
		System.out.format("\nThe  area of the square is : %.2f ",(s*s));
		sc.close();
	}
//-------------------------------------------------------------------------------------	
	
	public void Rectangle() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		double l = sc.nextDouble();
		System.out.print("\nEnter the Breadth : ");
		double b = sc.nextDouble();
		
		System.out.format("\nThe  area of the Rectangle is : %.2f",(l*b));
		sc.close();
	}
//-------------------------------------------------------------------------------------	
		
	public void Circle() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double r = sc.nextDouble();
		
		System.out.format("\nThe  area of the Circle is : %.2f ",(3.14*r));	
		sc.close();
	}
//-------------------------------------------------------------------------------------
	public void Triangle() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Base : ");
		double b = sc.nextDouble();
		System.out.print("\nEnter the Height : ");
		double h = sc.nextDouble();
		
		System.out.format("\nThe  area of the Triangle is : %.2f",(0.5*b*h));
		sc.close();
	}
//------------------------------------------------------------------------------------	
	

}
