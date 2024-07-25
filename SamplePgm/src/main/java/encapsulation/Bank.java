package encapsulation;

public class Bank {
	
	private int pin,amnt,bal=20000;
	
	public void setter(int pin,int amnt) {
		this.pin=pin;
		this.amnt=amnt;
		
	}
	
	public void getter() {
		
		switch(pin) {
		
		case 1001:bal=bal-amnt;
			      System.out.println("Amnt:"+amnt+" is withdrawed and available Balance is: "+bal);
			      break;
		case 1234:bal=bal-amnt;
	      		  System.out.println("Amnt:"+amnt+" is withdrawed and available Balance is: "+bal);
	      		  break;
		case 1212:bal=bal-amnt;
	      		  System.out.println("Amnt:"+amnt+" is withdrawed and available Balance is: "+bal);
	      		  break;  
		default:  System.out.println("Invalid Pin");
		          break;
	      		  
		}
		
	}
	

}
