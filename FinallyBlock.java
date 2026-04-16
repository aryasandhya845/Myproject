package ExceptionHandilng;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try
		{
		int a=10;
		int b=0;
	    int c=a/b;
		

	}
		catch(Exception e)
		{
			System.err.println(e);
		}
		finally
		{
			System.err.println("hello");
		}
		
	}

}
