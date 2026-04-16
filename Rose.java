package interfaceprogram;
abstract class Flowers
{
	abstract void beauti();
	 abstract void show();
	
}
public class Rose extends Flowers {
	

	@Override
	void beauti() {
		
		System.out.println("rose is beautiful flower");
	}

	@Override
	void show() {
		System.out.println("sunflower is a beautiful flower");
		
	}
	public static void main(String args[])
	{
	 Flowers  f=new Rose();
	 f.beauti();
	 f.show();
	}

}
