package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
        int size,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements in an array : ");
		size = sc.nextInt();	
		
		int arr[] = new int[size];
		
		System.out.print("Enter " + size + " elements of an Array  : ");
		for (i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		        System.out.println("Original array: ");  
		        for (i = 0; i < size; i++) 
		        {  
		            System.out.println(arr[i] + " ");  
		        }  
		        System.out.println("Array in reverse order: ");  
		        for (i = size-1; i >= 0; i--) {  
		            System.out.println(arr[i] + " ");  
		        } 
	}

}
