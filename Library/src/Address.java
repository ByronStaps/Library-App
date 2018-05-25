
public class Address {

	private String Address;
	private String State;
	private String City;
	private String Zip;
	
	
	public Address(String address, String state, String city, String zip) {
		
		this.Address = address;
		this.City = city; 
		this.State = state;
		this.Zip = zip;
	}
	public Address() {
		//super();
	}
	public String getAddress() {
		return Address;
	}

	public void setAddress (String Address) {

		this.Address = Address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}


}