package interfaceprogram;


abstract class Demo2
{
	 abstract void show();
	
}
public class Hondaabstract  extends Demo2{

	@Override
	void show() {
		System.out.println("running");
		
	}
	public static void main(String args[])
	{
		Demo2 b= new Hondaabstract();
		b.show();
	}
	

}
