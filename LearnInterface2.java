package interfaceprogram;

interface Student{
	 void show();
	   private void display()
	 {
		 System.out.println(" hello ");
	 }
}
interface I
{
	 void show();
}

public class LearnInterface2  implements Student{

	@Override
	public void show() {
		System.out.println(" hii");
	}
		
		public static void main(String args[])
		{
			Student s=new LearnInterface2();
			s.show();
			

		}
		
	
      
}
