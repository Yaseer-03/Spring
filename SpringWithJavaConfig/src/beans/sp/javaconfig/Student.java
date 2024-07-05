package beans.sp.javaconfig;

public class Student {
	private int id;
	private String name;
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void studentDetails() {
		System.out.println("Student id     is : " + id);
		System.out.println("Student name   is : " + name);
		System.out.println("Student gender is : " + gender);
		
	}
}
