package ExceptionHandilng;

public class NumberFormateException {

	public static void main(String[] args) {
		String str="sandhya";
	try
		{
			int a=Integer.parseInt(str);
			System.out.println(a);
			
		}
        catch(NumberFormatException n)
        {
        	System.out.println("String  "+str+"   can not be converted to integer ");
        	
         }
        	


	}

}
