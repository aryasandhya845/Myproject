package practicsquestion;

public class FindMinNumber {

	public static void main(String[] args) {
     String n="sandhya";
     
     for(int i=0;i<n.length();i++)
     {
    	 char charAt = n.charAt(i);
    	 for(int j=i+1;j<n.length();j++)
    	 {
    		 if(i==j)
    		 {
    			 System.out.println("duplicate number"+n);
    		 }
    	 }
     }

	}

}
