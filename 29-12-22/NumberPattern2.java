package afternoon;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		int i,j, row_size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row Size:");
		row_size = sc.nextInt();
		
		for(i=row_size; i>=1; i--) 
		{
			for(j=row_size; j>=i; j--) {
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
}