package abstraction;

public class Video extends Google {

	public void search() {
		
		System.out.println("Searching Video");
	}
	public void browse() {
		System.out.println("Browsing the video request");
		
	}
	
	public static void main(String[] args) {
		Video vi = new Video();
		Image im = new Image();
		vi.browse();
		vi.search();
		im.search();

	}

}
