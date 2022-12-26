package afternoon;

public class NaturalNum {

	public static void main(String[] args) {
		int num1 , num2, mul=1;
	      num1 = 5;
	      num2 = 10;
	  
	      System.out.println("The first and last numbers are " +num1 +" and "+num2 );
	      for(int i = num1; i <= num2; ++i){
	         mul *= i;
	      }
	      System.out.println("The product of natural numbers from " + num1 + " to " + num2 + " is " +mul);

	}

}
