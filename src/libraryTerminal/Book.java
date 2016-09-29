package libraryTerminal;

public class Book {

		public String newTitle;
		public String newAuthor;
	    public String newCategory;

	    public Book(String title, String author, String category) {
	        newTitle = title;
	        newAuthor = author;
	        newCategory = category;
	        
	    }
	    public String getAuthor(){
	    	return newAuthor;
	    }
	    
	    public void setAuthor(String author){
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
	    public String toString(){
	    	return newTitle + " " + newAuthor + " " + newCategory;
	    }
	    
	}