package patternquestion;

public class StarPattern3 {
public static void main(String[] args) {
	

	   for(int i=1;i<=5;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.err.print(" *");
		   }
		   System.err.println();
	   }
	   
	   for(int i=1;i<=5;i++)
	   {
		   for(int j=4;j>=i;j--)
		   {
			   System.err.print(" *");
		   }
		   System.err.println();
	   }
	   
	   
	   
}
}
