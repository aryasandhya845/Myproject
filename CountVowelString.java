package LogicalProgram2;

public class CountVowelString {

	public static void main(String[] args) {
		String vowel="programming";
		int count=0;
		
		for(int i=0;i<vowel.length();i++)
		{
			char a=vowel.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			count++;
		}
		System.err.println(count);

	}

}
