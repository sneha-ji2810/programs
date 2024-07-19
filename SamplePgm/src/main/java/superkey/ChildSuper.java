package superkey;

public class ChildSuper extends ParentSuper{

	int num=2;
	public ChildSuper(int a,int b) {
		super(2,3);
		System.out.println(a+b);
		System.out.println("Child Constructor call");
	}
	
	
	public void display() {
		super.display();
		
		System.out.println("Child Class Method");
		System.out.println(num);
		System.out.println(super.num);
	super.test();
	}
	
	
	public static void main(String[] args) {
	
ChildSuper c = new ChildSuper(6,4);
c.display();
		
	}

}
