package ExceptionHandilng;

public class Demo {
	void div(int a,int b)throws ArithmeticException
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

	public static void main(String[] args) throws ArithmeticException
	{
		Demo d=new Demo();
		try
		{
		d.div(12,0);
		
		}
	catch( ArithmeticException e)
		{
		 System.out.println("the value b is zero");
		}
		
		

	}

}
