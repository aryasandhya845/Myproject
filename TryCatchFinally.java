package ExceptionHandilng;

public class TryCatchFinally {

	public static void main(String[] args) {
		try
		{
			System.out.println("learn java coding");
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(" can not be devide by zero");
		}
		finally
		{
			System.out.println("good byee");
		}
		System.out.println("hello");

	}

}
