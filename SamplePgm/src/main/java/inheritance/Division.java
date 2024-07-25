package inheritance;

public class Division extends Addition {

	public void div(int a,int b) {
		int result=super.sum(a,b);
		if(result%10==0)
			System.out.println("Divisible by 10");
		else
			System.out.println("Not divisible by 10");
		
	}
	
	public static void main(String[] args) {
		Division d = new Division();
		d.div(5,5);
	}

}
