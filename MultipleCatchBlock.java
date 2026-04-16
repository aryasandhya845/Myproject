package ExceptionHandilng;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try
		{
			int a=30,b=0;
			int c=a/b;
			System.out.println(c);
			
			int arr[]= {1,4,6,7};
			System.out.println(arr[6]);
			
			String str="sandhya";
			System.out.println(str.toUpperCase());
		}
		catch(ArithmeticException e)
		{
			System.out.println("can not  devide by zero ");

	}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("beyond the aary limit");
		}
		catch(NumberFormatException e)
		{
			System.out.println("can not be converted uppercase");
		}
		catch(Exception e)
		{
			System.out.println("all type Exception handle");
		}

	
	}

}
