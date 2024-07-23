package review;

public class stringReve {

	public static void main(String[] args) {
		String s="Sneha";
		
		String re="";
		int n=s.length();
		for(int i=n-1;i>=0;i--) {
			
			re=re+s.charAt(i);
			
		}
		System.out.println(s);
		System.out.println(re);
		

	}

}
