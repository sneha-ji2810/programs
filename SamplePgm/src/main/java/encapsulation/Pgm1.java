package encapsulation;

public class Pgm1 {

	private String name;
	private long acctno;
	private int bal;
	
	public void setter(String name,long acctno,int bal) {
		
		this.name=name;
		this.acctno=acctno;
		this.bal=bal;
	}
	
	public void getter() {
		
		System.out.println("Name:"+name+",Account no:"+acctno+",balance"+bal);
		
	}
	
	

}
