package libraryTerminal;
	

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class BookListApp {
	//Declarations
 static Scanner sc = new Scanner(System.in);
 
 

	    public static void main(String[] args) {
	    	int min=0;
			int max=3;
	        System.out.println("Welcome to the Grand Circus Book Club\n");
	       // System.out.println("Press (1) if you are checking out or press (2) if you are returning?)");
	        //throw exception if enter a number less than '1'or more than '2'
	        int a = Console.getInt("Press (1) if you are checking out or press (2) if you are returning?" , min, max); //get input from user
			
	       // int a = sc.nextInt();
	       
	        //while()

	        ArrayList<Book> allBooks= BookDB.getallBooks();

	        System.out.println("There are " + allBooks.size()  + 
	                " Books in the library list.\n");
	        for (Book m : allBooks) {
                System.out.println(m.toString());
            }
	        System.out.println();
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


