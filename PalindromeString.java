package practicsquestion;

public class PalindromeString {

	public static void main(String[] args) {
		String name="Madam";
	 String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev+=name.charAt(i);
		}
		if(name.equals(rev))
		{
		System.out.println("palindrome");

	}
		else
		{
			System.err.println("not palinrome ");
		}
}
}