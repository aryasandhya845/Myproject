package LogicalProgram2;

public class FindDuplicateString {

	public static void main(String[] args) {
		 String name="sandhya";
		char[] c=name.toCharArray();
		
		
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(c[i]==c[j])
				{
					System.err.println(c[i]);
					break;
				}
			}
		}

	}

}
