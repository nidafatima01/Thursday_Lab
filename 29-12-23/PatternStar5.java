package afternoon;

public class PatternStar5 {

	public static void main(String[] args) {
		int i, j, k, row=10 ;
	      
	      for(i=0; i<row; i++)
	      {
	         for(k=0; k<i; k++)
	            System.out.print(" ");
	         for(j=i; j<row; j++)
	            System.out.print("* ");
	         System.out.print("\n");
	      }
	      for(i=0; i<row; i++)
	      {
	         for(k=(i+1); k<row; k++)
	            System.out.print(" ");
	         for(j=0; j<=i; j++)
	            System.out.print("* ");
	         System.out.print("\n");
	      }
	}

}