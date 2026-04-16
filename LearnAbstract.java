package interfaceprogram;
abstract class Demo
{
	abstract void show();
	  void display()
	  {
		  System.out.println("hello ");
	  }
}

public class LearnAbstract extends Demo {

	@Override
	void show() 
	{
		System.out.println("i am learning java programming");
		
	}
	
	public static void main(String args[])
	{
	   Demo aa=new LearnAbstract();
	 
		aa.show();
		aa.display();
	}

}
