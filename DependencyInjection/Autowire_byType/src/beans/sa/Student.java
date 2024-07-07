package beans.sa;

public class Student {
	private int id;
	private String name;
	private Address address;
	public int getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void studentDetails() {
		System.out.println("Student ID is: " + id);
		System.out.println("Student Name is: " +name);
		System.out.println("Student Address is: " + address);
	}

}
