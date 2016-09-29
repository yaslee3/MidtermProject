package libraryTerminal;
	

import java.util.ArrayList;
	import java.util.Scanner;



public class BookListApp {
	
 Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        System.out.println("Welcome to the Grand Circus Book Club\n");

	        ArrayList<Book> allBooks= BookDB.getallBooks();

	        System.out.println("There are " + allBooks.size()  + 
	                " Books in the library list.\n");

	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            String category = Console.getRequiredString(
	                    "What category are you interested in? (Adventure, Romance or Horror?)");
	            System.out.println();
	            // to access Movie DB class to get categories
	            ArrayList<Book> Book = BookDB.getBook(category);
	            
	            for (Book m : Book) {
	                System.out.println(m.getTitle());
	            }
	            System.out.println();
	            
	            choice = Console.getChoice("Continue? (y/n): ", "y", "n");
	            System.out.println();            
	        }
	    }
	}


