package polymorphism;

public class OnSeason extends OffSeason {
	

	public void discount(int amnt) {
		int price = (40*amnt)/100;
		System.out.println("Printing Data");
		System.out.println("Discount amnt is:"+price);
		
	}

	public static void main(String[] args) {
		OnSeason obj = new OnSeason();
		obj.discount(2000);
		OffSeason of = new OffSeason();
		of.discount(1000);

	}

}
