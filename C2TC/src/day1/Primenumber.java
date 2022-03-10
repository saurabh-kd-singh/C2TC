package day1;
import java.util.Scanner;
import java.lang.Math;

public class Primenumber {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number : ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		for(int i=2; i<=Math.sqrt(n);i++) {
			if((n%i)==0) {
				System.out.println("Not a Prime Number");
				break;
			}
			else {
				System.out.println("Prime Number");
			}
		}
		

	}

}
