package interfaceprogram;

interface Animal{
	void eat();
	void sleep();
	
}
public class Dog implements Animal {

	@Override
	public void eat() {
		System.err.println(" dog is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	public static void main(String args[])
	{
		Animal aa=new Dog();
		aa.eat();
		aa.sleep();
	}
	

}
