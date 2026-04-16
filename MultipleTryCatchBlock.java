package ExceptionHandilng;

public class MultipleTryCatchBlock {

	public static void main(String[] args) {
		try
		{
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("can not  be devide by Zero");
 
		}
		try
		{
			int a[]= {10,20,30};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("beyond the array limit");
		}

	}

}
