package encapsulation;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Pin");
		b.setter(sc.nextInt(), 1500);
		b.getter();
		

	}

}
