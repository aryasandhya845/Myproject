package practicsquestion;

public class FindMaxNumber {

	public static void main(String[] args) {
	     int []a= {1,3,4,6};
	     int max=a[0];
	     for(int i=0;i<a.length;i++)
	     {
	    	 if(max<a[i])
	    	 {
	    		 max=a[i];
	    	 }
	     }
	     System.out.println(max);

	}

}
