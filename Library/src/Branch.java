
public class Branch {

	private String libraryName;
	private String hourOperations;
	private Address address;
	private int customerId;
	private boolean active;
	private Book [] book;
	private Customer [] customer; 


	public Branch(String libraryName, String hourOperations, int customerId, boolean active,  Book [] book, Customer []customer, Address address) {

		this.libraryName = libraryName;
		this.hourOperations = hourOperations; 
		this.address = address;
		this.customerId = customerId;
		this.active = active; 
		this.book = book;
		this.customer = customer; 

	}

	public Branch() {
		
		
	}


	public Customer[] getCustomer() {
		return customer;
	}


	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}


	public String getLibraryName() {
		return libraryName;
	}

	public Address getAddress () {
		return address;
	}

	public void setAddress (Address address) {
		this.address = address;
	}

	public String getlibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getHourOperations() {
		return hourOperations;
	}
	public void setHourOperations(String hourOperations) {
		this.hourOperations = hourOperations;
	}
	public Book[] getBook() {
		return book;
	}
	public void setBook(Book [] book) {

		this.book = book;
	}

	public Book[] addbook(Book newBook) {
		Book [] group = new Book[this.book.length+1];
		for(int i = 0; i < this.book.length; i++) {
			group[i] = this.book[i];
			this.book = group;
		}
		return group;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public boolean isActive() {

		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Customer [] addCustomer (Customer newCustomer){
		
		Customer [] group = new Customer [this.customer.length+1];
		for (int i = 0; i < this.customer.length; i++) {
			
		}
		return group;
		
	}






}
