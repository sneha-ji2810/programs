package interfacepgm;

public class HDFC implements RBI{
	
	public void recurringDeposit(int amnt,int duration,int r) {
		int sumreturn=(amnt*duration*r)/100;
		System.out.println("Amnt in return is:"+sumreturn);
		
	}

	public static void main(String[] args) {
		HDFC h = new HDFC();
		int r= h.rate;
		h.recurringDeposit(30000, 2,r);

	}

}
