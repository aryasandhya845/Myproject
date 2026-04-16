package LogicalProgram2;

public class FabonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;
		int n=5;
	     
		System.out.println(a);
		System.err.println(b);
		for(int i=2;i<=n;i++)
		{
			int c=a+b;
			System.err.println( c);
			a=b;
			b=c;
		
		}
		

	}

}
