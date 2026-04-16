package patternquestion;

public class StarPattern5 {

	
	  public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.err.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.err.print("*");
			}
			System.err.println();
		}
	}
}
