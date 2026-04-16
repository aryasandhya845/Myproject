package polymmorphism;
abstract class Dog
{
	abstract void makeSound();
	abstract void Start();
}

public  class AbstractProgram extends Dog {
	void makeSound()
	{
		System.out.println(" bark");
	}
	void Start()
	{
		System.out.println(" start with key");
	}

	public static void main(String[] args)
	{
		
		AbstractProgram aa =new AbstractProgram ();
		aa.makeSound();
		aa.Start();
	}

}
