package array;

public class SearchMax {

	public static void main(String[] args) {
		int a[]= {2,5,8,3,7,9};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
				}
		System.out.print(+max);


	}

}
