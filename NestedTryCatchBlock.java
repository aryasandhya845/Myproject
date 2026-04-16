package ExceptionHandilng;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		try
		{
			try
			{
				int a[]= {3,6,8,3,2};
				System.out.println(a[6]);
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				System.out.println(a);
			}
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can,t not devide by zero");
		}

	}

}
