package InterviewQuestion;

public class SwapppingWithoutUsingThirdVariable {

	
	public static void main(String[] args) {
		int a=10,b=20;
		
		System.err.println("Before swapping a="+a+",b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.err.println("After  swapping a="+a+",b="+b);
	}
}
