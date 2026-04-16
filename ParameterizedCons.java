package constructor;

public class ParameterizedCons {
      
	int age;
	String name;
	
	ParameterizedCons(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
	void show()
	{
		System.err.println(age+" "+name);
	}
	public static void main(String[] args) {
		ParameterizedCons p1=new ParameterizedCons(12,"sandhya");
           p1.show();
	}
}
