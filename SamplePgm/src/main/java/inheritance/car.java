package inheritance;

public class car extends Vehicle {

	int speed=20;
	public void display() {
		
	System.out.println("Speed is:"+speed);
		
	}
	
	
	public static void main(String[] args) {
		
		car obj = new car();
		obj.display();
		obj.show();
		System.out.println(obj.speed);
		System.out.println(obj.brand);

	}

}
