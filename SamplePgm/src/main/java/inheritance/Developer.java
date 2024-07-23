package inheritance;

public class Developer extends Employee {

	public static void main(String[] args) {
		
		Developer dev = new Developer();
		Tester tes = new Tester();
		tes.testData();
		tes.display();
		dev.devData();
		System.out.println("EmpId:"+dev.devId);

	}

}
