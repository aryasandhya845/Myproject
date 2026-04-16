package logicalprogram;

public class OddNumber {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++)
		{
		//	System.out.println(i+(i%2!=0 ?"even number" :"odd number"));
			System.out.println(i + " is " + (i % 2 == 0 ? "even number" : "odd number"));
		
			
		}

	}

}
