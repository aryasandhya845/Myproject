package polymmorphism;

public class EncapsulationProgram {
	  private int value;
	 
 public void	setvalue(int a)
  {
	  value=a;
  }
  public int  getvalue()
  {
	return value;
  }

	public static void main(String[] args) {
		
		 EncapsulationProgram  aa=new  EncapsulationProgram ();
		aa.setvalue(100);
	aa.getvalue();
	System.out.println(aa.getvalue());

	}

}
