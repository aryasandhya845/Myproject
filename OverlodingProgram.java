package polymmorphism;

public class OverlodingProgram {
	int age;
	String name;
	void demo(int a,String b)
	{
		age=a;
		name=b;
		System.out.println(age+" "+name);
	}
	void demo(int a)
	{
		System.out.println(a);
	}
	void demo()
	{
		System.out.println(" i am writting the overloading program");
	}
	void demo(String course)
	{
		System.out.println(course);
	}

	public static void main(String[] args) {
		OverlodingProgram aa=new OverlodingProgram ();
		aa.demo("bca");
		

	}

}
