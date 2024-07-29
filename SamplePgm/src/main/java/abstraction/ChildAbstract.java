package abstraction;

public class ChildAbstract extends ParentAbstract{

	
	public void display() {
		
		System.out.println("Abstract method implimented");
		
	}
	
	public void sum(int a,int b) {
		int sum=a+b;
		System.out.println("Sum is:"+sum);
		
	}
	
	public static void main(String[] args) {
	
		ChildAbstract c = new ChildAbstract();
		c.display();
		c.show();
		c.sum(5, 5);

	}

}
