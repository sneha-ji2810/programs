package aggregation;

public class Student {
	
	String name,dept;
	int rolno;
	Address ad ;//refernce variable for class Address
	public Student(String name,String dept,int rolno,Address ad) {
		this.name=name;
		this.dept=dept;
		this.rolno=rolno;
		this.ad=ad;
		
	}

	public void display() {
		
		System.out.println("Student Data are:");
		System.out.println(name);
		System.out.println(dept);
		System.out.println(rolno);
		System.out.println(ad.housename);
		System.out.println(ad.houseno);
		System.out.println(ad.street);
		System.out.println(ad.dist);
		System.out.println(ad.pin);
	}
	
	public static void main(String[] args) {
		
	Address obj = new Address("roseVilla",21,"Street1","Ernakulam",66542);
	Student st = new Student("Sneha","EC",24,obj);
	st.display();
	
	
	}

}
