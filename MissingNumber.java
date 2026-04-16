package array;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8};
		int n=a.length+1;
		int Total_sum=n*(n+1)/2;
		System.out.println(+Total_sum);
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.print("missing number"+(Total_sum-sum));
		

	}

}
