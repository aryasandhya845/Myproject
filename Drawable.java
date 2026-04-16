package interfaceprogram;

interface Circle
{
	 void show();
}
 
  class Drawable implements Circle {
	
	@Override
	public void show() {
		System.out.println("sandhya");
		
	}
	public static void main(String args[])
	{
		Circle c=new Drawable();
		c.show();
	}
 
	
	
}
