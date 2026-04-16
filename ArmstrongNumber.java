package LogicalProgram2;

public class ArmstrongNumber {
  public static void main(String[] args) {
	
      
	int n=153;
	int arm=0;
	int c=n;
	
	while(n!=0)
	{
		int rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
		
	}
	if(c==arm)
	{
		System.err.println("Armstrong number");
	}
	else
	{
		System.err.println("not Armstrong number");
	}
}
}