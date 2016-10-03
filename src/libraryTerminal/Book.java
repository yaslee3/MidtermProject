package libraryTerminal;

public class Book {
	public String newBooknum;
	public String newTitle;
	public String newAuthor;
	public String newCategory;

	//Constructor to establish data type and variables
	public Book(String booknum, String title, String author, String category) {
		newBooknum = booknum;
		newTitle = title;
		newAuthor = author;
		newCategory = category;

	}

	public Book(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String getnewbooknum() {
		return newBooknum;
	}

	public void setnewBooknum(String newbooknum) {
		newBooknum = newbooknum;
	}

	public String getAuthor() {
		return newAuthor;
	}

	public void setAuthor(String author) {
		newAuthor = author;
	}

	public String getTitle() {
		return newTitle;
	}

	public void setTitle(String title) {
		newTitle = title;
	}

	public String getCategory() {
		return newCategory;
	}

	public void setCategory(String category) {
		newCategory = category;
	}

	public String toString() {
		return newTitle + " " + newAuthor + " " + newCategory;
	}
	public String toString1() {
		return newAuthor;
	}

}