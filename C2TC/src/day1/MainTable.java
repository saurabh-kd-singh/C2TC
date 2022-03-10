package day1;
import java.util.Scanner;

public class MainTable {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number between 1 to 100 : ");
		Scanner obj1=new Scanner(System.in);
		n=obj1.nextInt();
		
		for(int i=1; i<=10; i++) {
			int m=n*i;
			System.out.println(n+"*"+i+"="+m);
		}

	}

}
