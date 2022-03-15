package day8;
import java.util.Scanner;

public class RepeatedStringHackerRank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String :");
		String s = sc.nextLine();
		
		System.out.print("\nEnter the repeating length : ");
		int n = Integer.parseInt(sc.nextLine());
		
		int count_a = 0;
        long final_count_a = 0;
        

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                count_a++;
            }  
        }
        
     
        long complete_repeat_count = n / s.length();
        final_count_a = complete_repeat_count * count_a;
        
        
        long remaining_length = n % s.length();
        for(int i=0; i<remaining_length; i++)
        {
            if(s.charAt(i) == 'a')
            {
                final_count_a++;
            }
        }

        System.out.println("The total number of a : " + final_count_a);
        
	}

}
