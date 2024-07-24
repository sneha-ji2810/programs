package polymorphism;

public class OnSeason extends OffSeason {
	

	public void discount(int amnt) {
		int price = (40*amnt)/100;
		System.out.println("Printing Data is");
		System.out.println("Discount amnt is:"+price);
		
	}

	public static void main(String[] args) {
		OnSeason obj = new OnSeason();
		obj.discount(4000);
		OffSeason of = new OffSeason();
		of.discount(1000);

	}

}
