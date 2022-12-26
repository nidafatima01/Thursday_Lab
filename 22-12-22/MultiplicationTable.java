package afternoon;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		//program to print Multiplication Table
		
		int i, n, mul=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n =");
		n = sc.nextInt();
		
		System.out.println("Multiplication Table of " +n+ " is:");
		for(i=1;i<=10;i++) {
			mul=n*i;
			System.out.println(n + "*" + i + "="+ mul);
		}
	}

}
