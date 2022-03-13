package day5;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		int[][] Matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16} };
		
//---------------------------------------------------------------------------------------
		//For Loop
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++) {
				System.out.print(Matrix[i][j] + " ");
			}
			System.out.println();
		}
//---------------------------------------------------------------------------------------
		
		int[] Arr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16 };
		
		//For Each Loop
		for(int element : Arr) {
			System.out.print(element + " ");
		}
//---------------------------------------------------------------------------------------	
		
		//While Loop
		int n = 1;
		while(n==1) {
			System.out.println("\nWhile Loop is Working, To continue Enter 1 , To stop Enter 0");
			Scanner sc = new Scanner(System.in);
			n = Integer.parseInt(sc.nextLine());
		}
//---------------------------------------------------------------------------------------
		
		//do while loop
		int m = 1;
		
		do {
			System.out.println("\n Do While Loop is Working, To continue Enter 1 , To stop Enter 0");
			Scanner sc = new Scanner(System.in);
			m = Integer.parseInt(sc.nextLine());
			
		}while(m==1);

//----------------------------------------------------------------------------------------		
	}

}
