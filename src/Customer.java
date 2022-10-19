
public class Customer {
	private String name;
	private Address address;
	
	public Customer(String name,Address address)
	{
		this.address=address;
		this.name=name;
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
