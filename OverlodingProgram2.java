package polymmorphism;

public class OverlodingProgram2 {
	void show()
	{
		System.out.println("i am writting a program");
		
	}
	void show(int a)
	{
		System.out.println(a);
		
	}
	void show(String name)
	{
	 System.out.println(name);
		
	}
	void show(int a ,String name)
	{
		System.out.println(a+" "+name);
	}

	public static void main(String[] args) {
		OverlodingProgram2 ss=new OverlodingProgram2();
		ss.show(21,"sandhya");

	}

}
