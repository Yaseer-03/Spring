package beans.sa;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name;
	@Autowired
	private Address address;
	public int getId() {
		return id;
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
