package ExceptionHandilng;

 class YoungerAgeException  extends RuntimeException{

	YoungerAgeException(String message)
	{
		super(message);
	}
	    
	
}
class Voting
{
	public static void main(String[] args) {
		
	
	int age =16;
	try
	{
	if(age<18)
	{
		throw new YoungerAgeException("you are not eligibal for vote");
	}
	else
	{
		System.err.println("vote successfully");
	}
	}
	catch(YoungerAgeException e)
	{
		System.err.println(e);
	}
	
}
}