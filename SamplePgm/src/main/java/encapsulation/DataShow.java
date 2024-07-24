package encapsulation;

public class DataShow {

	public static void main(String[] args) {
		StudentData obj = new StudentData();
		obj.setName("Sneha");
		obj.setAge(28);
		obj.setDept("EC");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getDept());

	}

}
