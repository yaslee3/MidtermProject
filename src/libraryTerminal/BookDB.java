package libraryTerminal;
import java.util.ArrayList;

public class BookDB {


	

	

	    public  static ArrayList<Book> allBooks= new ArrayList<>(100);
	    
	    public static ArrayList<Book> getallBooks() {
	    	
	        allBooks.add(new Book("Divergent", "Veronica Roth", "Adventure"));
	        allBooks.add(new Book("The Infinity Sea"," Rick Yancey"," Adventure"));
	        allBooks.add(new Book("Into the Wild", "Jon Krakauer"," Adventure"));
	        allBooks.add(new Book("Island of the Blue Dolphins", "Scott ODell", "Adventure"));
	        allBooks.add(new Book("Four Years Later", "Monica Murphy", "Romance"));
	        allBooks.add(new Book("Claimed", "Stacey Kennedy", "Romance"));
	        allBooks.add(new Book("Four Things a Woman want from a man", "A.R Bernard", "Romance"));
	        allBooks.add(new Book("To Catch a Lady; A Hunt Club Novel", "Pamela Labud","Romance"));
	        allBooks.add(new Book("Asylum:Volume 1", "Madeleine Roux","Horror"));
	        allBooks.add(new Book("Feed", "Mira Grant","Horror"));
	        allBooks.add(new Book("The Long Walk Home", "Stephen King","Horror"));
	        allBooks.add(new Book("A New Darkness", "Joseph Delaney","Horror"));
	      //  allBooks.add(new Book("The Troop", "Nick Cutter"));
	        
	        
	        return allBooks;
	    }
	    
	    public static ArrayList<Book> getBook(String category) {
	        ArrayList<Book> Book = new ArrayList<>();
	        for (Book m : allBooks) {            
	            if (m.getCategory().equalsIgnoreCase(category)) {
	                Book.add(m);
	            }
	        }
	        return Book;
	    }    
	}


