package beans.spdi;

public class Man {
	private String name;
	private long   mobileNumber;
	private Personality details;
	public void setName(String name) {
		this.name = name;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setDetails(Personality details) {
		this.details = details;
	}
	public void manDetails() {
		System.out.println("Name: " + name);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Personality: " + details);
	}
	
}
