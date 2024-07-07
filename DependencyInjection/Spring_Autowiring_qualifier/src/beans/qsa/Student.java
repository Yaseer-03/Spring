package beans.qsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	private String name;
	@Autowired
	@Qualifier("address_1")
	private Address address;
	@Autowired
	private Subject subjects;
	public Subject getSubjects() {
		return subjects;
	}
	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}
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
		System.out.println("Subjects : " + subjects);
	}

}
