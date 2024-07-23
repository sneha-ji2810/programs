package aggregation;

public class Book {

	String bookName;
	int prize;
	Author at;
	
	public Book(String bookName,int prize,Author at) {
		this.bookName=bookName;
		this.prize=prize;
		this.at=at;
		
	}
	
	public void display() {
		System.out.println("Book Details");
		System.out.println(bookName);
		System.out.println(prize);
		System.out.println("Author data");
		System.out.println(at.name);
		System.out.println(at.age);
		
	}
	
	public static void main(String[] args) {
		
		Author obj = new Author("Benyamin",78);
		Book b = new Book("Aadujeevitham",120,obj);
		b.display();

	}

}
