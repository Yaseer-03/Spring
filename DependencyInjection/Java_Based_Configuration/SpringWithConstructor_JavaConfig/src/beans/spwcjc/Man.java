package beans.spwcjc;

public class Man {
	private String name;
	private long   mobileNumber;
	private Personality details;
	public Man(String name, long mobileNumber,Personality details) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.details = details;
	}
	public void personDetails() {
		System.out.println("Name : " + name);
		System.out.println("Mobile number : " + mobileNumber);
		System.out.println("Personality details : " + details);
	}
	
}
 