package interfacepgm;

public class ChildInterface implements InterfaceSample {

	public  void display() {
		
		System.out.println("Implimentation -1");
		
	}
	public void print() {
		System.out.println("Implimentation -2");
		
	}
	
	public void sum(int a,int b) {
		
		System.out.println("Sum is:"+a+b);
		
	}
	
	public static void main(String[] args) {
		InterfaceSample obj = new ChildInterface();//Upcasting
		ChildInterface ob = new ChildInterface();
		obj.display();
		obj.print();
		ob.sum(5,5);
		ob.display();
		ob.print();
		System.out.println(obj.X);
		System.out.println(obj.MIN_VAL);
	}

}
