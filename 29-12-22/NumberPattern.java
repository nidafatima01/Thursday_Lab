
package afternoon;

import java.util.Scanner;

public class NumberPattern{

		public static void main(String[] args) {
			int row_size;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Row Size:");
			row_size = sc.nextInt();
			
			int i, j, count=1;
			for (i = 1; i <= row_size; i++)
			  {
			    for (j = 1; j <= i; j++)
			    {
			     System.out.print(count);
			      count++;
			    }
			    System.out.println();
		      }
		}
	}
