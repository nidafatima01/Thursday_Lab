package array;
import java.util.Scanner;
public class OddEvenArray {

	public static void main(String[] args) {
		
		int Size, i;
		int evenCount = 0, oddCount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int a[] = new int[Size];
		
		System.out.print("Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++){
			a[i] = sc.nextInt();
		}   
        for(i = 0; i < Size; i++){
			if(a[i] % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("Total Number of Even Numbers in this Array = " + evenCount);
		System.out.println("\n Total Number of Odd  Numbers in this Array = " + oddCount);
	}
}
