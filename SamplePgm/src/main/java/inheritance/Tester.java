package inheritance;

public class Tester extends Employee {

	public void display() {
		
		System.out.println("INside tester");
	}
	
	public static void main(String[] args) {
		
		Tester tes = new Tester();
		tes.testData();
		System.out.println("EmpID:"+tes.tesId);
	}

}
