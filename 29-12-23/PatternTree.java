package afternoon;

public class PatternTree {

	public static void main(String[] args) {
		int row=10;
		for(int i=0;i<row;i++) 
		{
			for(int j=row-i;j>1;j--)
			{
				System.out.print(" ");
		}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<row/2;i++) {
			for(int j=row-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
       for(int k=0;k<=7; k++)
       {
    	   for(int l=0;l<=7; l++) {
    		   System.out.print(" ");
    	   }
    	   System.out.println("* *");
       }
		
	}

}
