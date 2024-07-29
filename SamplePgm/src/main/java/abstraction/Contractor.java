package abstraction;

public class Contractor extends Employee{

	
	public  void calculateSalary(int salary,int payhr) {
		int payment;
		payment=salary*payhr;
		System.out.println("Total payemnt is:"+payment);
		
	}
	
	public static void main(String[] args) {
		Contractor c = new Contractor();
		c.calculateSalary(3000, 5);

	}

}
