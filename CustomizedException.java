package ExceptionHandilng;

class UnderAgeExcetion extends Exception
{
	 UnderAgeExcetion()
	 {
		 super("u are under age");
		 
	 }
	 UnderAgeExcetion (String message)
	 {
		 super(message);
	 }
	
}
public class CustomizedException {

	public static void main(String[] args) throws  UnderAgeExcetion {
		
		int age=17;
		
		try
		{
		if(age<18)
		{
			throw  new  UnderAgeExcetion();
		}
		else
		{
			System.err.println("u can vote");
		}
		}
		catch( UnderAgeExcetion e)
		{
			System.err.println(e);
		}
		System.err.println("hello");
	}

}
