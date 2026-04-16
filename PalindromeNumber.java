package InterviewQuestion;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=122;
		int c=num;
		int rev=0;
		
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
        if(rev==c)
        {
        	System.err.println("palinrome number");
        }
        else
        {
        	System.err.println("not palindrome number");
        }
	}

}
