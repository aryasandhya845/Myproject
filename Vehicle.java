
package interfaceprogram;

interface Car{
	void show();
}
interface Bike{
	void display();
}
public class Vehicle implements  Car,Bike {
   @Override
	public void show()
	{
		System.out.println("start automatic");
	}
   @Override
	 public void display()
	{
		System.out.println("start in key");
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.show();
		v.display();

	}

}
