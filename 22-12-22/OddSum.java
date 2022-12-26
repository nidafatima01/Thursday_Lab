package afternoon;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		//find sum of all odd numbers from 1 to N
		
		int num, sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number :");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			if(i % 2 == 1) 
			{
				sum= sum+i;
			}
			
		}
		System.out.println("Sum of odd numbers upto " +num +" is " +sum);
	}

}
