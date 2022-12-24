package afternoon;
import java.util.Scanner;

public class CubeNum {

	public static void main(String[] args) {
		
		int num, cube;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a Number : ");
		num = sc.nextInt();		
		
		cube = num * num * num;

		System.out.println("Cube of a Number is: " +cube);
	}

}
