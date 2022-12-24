package afternoon;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		float length,width,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
        length=sc.nextFloat();
        
        System.out.println("Enter width of rectangle:");
        width=sc.nextFloat();
        
        area=length*width;
        System.out.println("Area of Recrangle: "+ area);

	}

}
