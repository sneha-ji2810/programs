package abstraction;

public class FullTimeEmployee extends Employee{

public void calculateSalary(int salary,int payhr) {
	int payment;
	payment=salary*payhr;
	System.out.println("Total payemnt is:"+payment);
		
	}
	
	
	public static void main(String[] args) {
		FullTimeEmployee fe = new FullTimeEmployee();
		fe.calculateSalary(3000, fe.payhr);

	}

}
