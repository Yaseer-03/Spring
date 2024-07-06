package setter.beans.sp;

public class Employee {
	private int id;
	private String name;
	private String address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void detailsOfEmployee() {
		System.out.println("Id is: " + id);
		System.out.println("Name is: " + name);
		System.out.println("Address is: " + address);
	}
}
