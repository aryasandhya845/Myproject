package polymmorphism;

class Student{
	void demo()
	{
		System.out.println("i am learning java");
	}
	void show()
	{
		System.out.println(" java is a programming language");
	}

}
public class OverriddingProgram2 extends  Student {
	void demo()
	{
		System.out.println("hello welcome  in java programming");
	}
	void show()
	{
		System.out.println(" hii");
	}
	
	public static void main(String[] args) {
		 Student s=new OverriddingProgram2  ();
		 s.demo();
		 s.show();

	}

}
