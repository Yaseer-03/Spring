package beans.springwithxml;

public class Employee {
	private long id;
	private String name;
	private long salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void employeeDetails() {
		System.out.println("Employee id     is : " + id);
		System.out.println("Employee name   is : " + name);
		System.out.println("Employee salary is : " + salary);
	}

}
