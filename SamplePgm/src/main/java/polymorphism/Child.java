package polymorphism;

public class Child extends Parent{

	
	public void sum(int a,int b) {
		
		int sum1=a+b;
		System.out.println("Sum of child Class"+a+","+b+" is:"+sum1);
		super.sum(5, 5);
		
	}
	
	public static void main(String[] args) {
	
		Child c = new Child();
		c.sum(6,4);

		Parent p = new Child();//Upcasting
		p.sum(2, 2);
	}

}
