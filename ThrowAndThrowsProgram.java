package ExceptionHandilng;

/*public class ThrowAndThrowsProgram {

	void div(int a,int b)
	{
		if(b==0)
		{
	          	throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		
		ThrowAndThrowsProgram  t=new ThrowAndThrowsProgram();
		t.div(10,0);
	}

}*/

public class ThrowAndThrowsProgram {

	void div(int a,int b) throws ArithmeticException 
	{
		if(b==0)
		{
	          	throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		
		ThrowAndThrowsProgram  t=new ThrowAndThrowsProgram();
		try
		{
		t.div(10,0);
	}
		catch(Exception e)
		{
			System.out.println("the value of b is zero");
		}
	}
}


