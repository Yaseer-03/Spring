package beans.sa;

public class Student {
	private int id;
	private String name;
	private Address address;
	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void studentDetails() {
		System.out.println("Student ID is: " + id);
		System.out.println("Student Name is: " +name);
		System.out.println("Student Address is: " + address);
	}

}
