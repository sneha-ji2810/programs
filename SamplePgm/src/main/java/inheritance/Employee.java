
package inheritance;

public class Employee {
	
	String devId="Dev001",namedev="Sneha";
	String tesId="Test001",nametest="Jijin";
	
	public void testData() {
		
		System.out.println("New Joinee in testing team data");
		System.out.println("Name:"+nametest);
		
	}
	
	public void devData() {
		System.out.println("New Joinee in development team data");
		System.out.println("Name:"+namedev);
		
	}

}
