package array;

import java.util.Scanner;

public class EqualArray {

	public static void main(String[] args) {
		int a1, a2, i, j;
		boolean status=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements in first array : ");
		a1 = sc.nextInt();	
		int[] arr1 = new int[a1];
		
		System.out.print("Enter Number of elements in second array : ");
		a2 = sc.nextInt();	
		int[] arr2 = new int[a2];
		
		System.out.print("Enter " + a1 + " elements of first Array : ");
		for (i = 0; i <a1; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter " + a2 + " elements of second Array : ");
		for (i = 0; i < a2; i++){
			arr2[i] = sc.nextInt();
		}
		for(i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				status=true;
				break;
			}
		}
	 if (status==false)
			System.out.println("Array elements are equal");	
	      else 
	    	  System.out.println("Array elements are not equal");
	}

}
