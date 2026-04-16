package LogicalProgram2;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter a number");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.err.println("even number");
		}
		else
		{
			System.err.println("odd number");
		}
		

	}

}
