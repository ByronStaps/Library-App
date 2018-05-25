
public class Properties {

	public static void main(String[] args) {

		/*Below is  an object constructor that allows to create an new object of an object name "b1"
		 * which begin to enter the class, so we have to use are getters and setters method, to 
		 * hold the data of our instance variable "private String name"
		 */

		//Book Class
		Book book1 = new Book( "John Smith", "4564654-464", "The newland Race", 209);
		Book book2 = new Book( "Mike", "63987-55-464", "The New Jack City", 320);
		Book book3 = new Book( "Chirs mike", "8796-989-4", "Islands of the Sea", 190);


		// created an Book of arrays togo throught the book of 
		Book [] booklist = {book1,book2,book3};



		//Address Class, which I assign this address to the first customer
		Address ad1 = new Address("123 Elm St", "Missouri", "St Louis", "63136");
		Address ad2 = new Address("453 Mcree", "Missrour", "Michigan", "91786");

		// Customer Class, which I assign the first book, first address, to the first customer.
		Customer c1 = new Customer();
		c1.setAddress(ad1);
		c1.setBook(booklist);
		c1.setAge(12);
		c1.setFirstName("John");
		c1.setLastName("Smith");
		c1.setGender("Male");
		c1.setId(45678656);


		Book [] returnBookList = c1.getBook();
		System.out.println(returnBookList.length);	
			System.out.println(returnBookList[0].getAuthor());







		}


	}


