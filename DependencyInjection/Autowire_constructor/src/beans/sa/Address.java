package beans.sa;

public class Address {
	private String city;
	private String state;
	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "\n city : " + city + "\n state : " + state;
	}

}
