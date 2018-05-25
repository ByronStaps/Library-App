
public class Customer {
	private String firstName;
	private String lastName; 
	private Address address;
	private int id;
	private int age;
	private String gender;
	private Book [] book;

	//Getters & Setters 

	public Customer() {
		
	}
	
	public void addCustomer(Customer customer) {
		
		
		
	}
	
	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {

		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 75)
		{
			System.out.println("Your pass the age limit sorry");
		}
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
