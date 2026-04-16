package polymmorphism;

 class vehicle
 {
	 void show()
{
	 System.out.println(" hello");
	
}
	 void display()
	 {
		 System.out.println(" what are u doing");
	 }
 }
 

public class OverridingProgram extends vehicle
{
   @Override
	void show()
	{
		 System.out.println(" hii");
		
	}
   @Override
		 void display()
		 {
			 System.out.println(" what going on");
		 }

	public static void main(String[] args) {
    vehicle ss=new OverridingProgram ();
    ss.show();
    ss.display();

	}

}
