package logicalprogram;

public class Primenumber1to100 {
public static void main(String args[])
{
	System.out.println("enter the number 1 to 100");
	for(int num=1;num<=100;num++)
	{
		 int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println(num);
			}
			
		}
	}
}
	
	

