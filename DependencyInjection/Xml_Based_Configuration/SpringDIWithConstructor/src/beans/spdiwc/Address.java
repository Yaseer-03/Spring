package beans.spdiwc;

public class Address {
	private String city;
	private String country;
	public Address(String city, String country) {
		this.city= city;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "\ncity: " + city + "\nState: " + country; 
	}

}
