package inheritance;

public class BabyDog extends Dog {
String breed="BullDog";
	public void ShowName() {
		
		System.out.println("BreedName:"+breed);
	}
	
	
	public static void main(String[] args) {
		
		BabyDog b= new BabyDog();
		b.Show();
		b.ShowBreeds();
		b.ShowName();
		

	}

}
