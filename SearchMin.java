package array;

public class SearchMin {

	public static void main(String[] args) {
		int a[]= {2,5,8,3,7,9};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
				}
		System.out.print(+min);


	}

}

