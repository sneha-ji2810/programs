package accessmodifier1;

public class Program1 {

	protected int a=10;
	protected void  show() {
		
	System.out.println("Inside Method "+a);	
	}
	
	public static void main(String[] args) {
		Program1 obj = new Program1();
		obj.show();

	}

}
