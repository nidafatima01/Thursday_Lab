package afternoon;

public class PatternStar4 {

	public static void main(String[] args) {

		      int i, j, row=5;
		      for(i=0; i<row; i++)
		      {
		         for(j=i; j>=0; j--)
		            System.out.print("* ");
		         System.out.println();
		      }
		      for(i=0; i<(row-1); i++)
		      {
		         for(j=(row-1); j>i; j--)
		            System.out.print("* ");
		         System.out.println();
		      }
	   }

}