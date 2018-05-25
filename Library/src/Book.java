
public class Book {

	private String author; 
	private String isbn;
	private String title;
	private int numofPages;
	
	public Book(String author, String isbn, String title, int numofPages) {
		this. author = author;
		this.isbn = isbn;
		this.title = title;
		this.numofPages = numofPages;
	}
	
	public Book() {
		
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumofPages() {
		return numofPages;
	}
	public void setNumofPages(int numofPages) {
		this.numofPages = numofPages;
	}
	
	
}
