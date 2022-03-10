package day1;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		int a,b,c;
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter First Number :");
		a=obj1.nextInt();
		
		Scanner obj2=new Scanner(System.in);
		System.out.println("Enter Second Number :");
		b=obj2.nextInt();
		
		c=a+b;
		System.out.println("Sum is : "+c);

	}

}
