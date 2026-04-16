package InterviewQuestion;

public class FindSmallestestNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {3,6,8,9,3,8,2};
		int min=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.err.println(min);
		
	}

}
