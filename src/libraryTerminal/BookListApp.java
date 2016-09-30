package libraryTerminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookListApp {
	// Declarations
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int min = 0;
		int max = 3;
		System.out.println("Welcome to the Grand Circus Book Club\n");
		
		// throw exception if enter a number less than '1'or more than '2'
		Console.getInt("Press (1) if you are checking out or press (2) if you are returning?", min, max); // get
																											// input
																										// from
																											// user
		ArrayList<Book> allBooks = BookDB.getallBooks();
		ArrayList<Book> shoppingCart = new ArrayList<Book>();

		
		
		
		

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			//Re-number the books when removed from arraylist
			for(int q=0;q<allBooks.size();q++){
				
				allBooks.get(q).setnewBooknum((q+1)+". "); 
			}

			System.out.println("There are " + allBooks.size() + " Books in the library list.\n");
			for (Book m : allBooks) {
				System.out.println(m.toString());
			}
			System.out.println();
			
			int search =Console.getInt("Press (1) if you are search by category or press (2) by author, or Press (3) for title?", min, max);
			
			if(search==1){
			
			String category = Console.getRequiredString("What category are you interested in? (Adventure, Romance or Horror?)");
			
			System.out.println();
			
			
			// to access Movie DB class to get categories
			ArrayList<Book> bookCat = BookDB.getBook(category);
			
			for (Book m : bookCat) {
				System.out.println(m.getnewbooknum() + m.getTitle()+" by: " + m.getAuthor());
				
			}
			System.out.println();
			}else if(search==2){
				System.out.println("Enter an author name.");
				String authorChoice=sc.nextLine();
				ArrayList<Book> bookAuth = BookDB.getAuthor(authorChoice);

				for (Book m : bookAuth) {
					System.out.println(m.getnewbooknum() + m.getTitle());
					//System.out.println(m.getnewbooknum() + m.getAuthor());
				}
			}
			
			
			// add println to enter a book number 1-12
			System.out.println("Which book would you like to borrow? (enter a number between 1 - 12)");
			int bookInput = sc.nextInt();// scan for number associated with book
			bookInput--;
			shoppingCart.add(allBooks.get(bookInput));	//add to shoppingCart
			allBooks.remove(bookInput);     //remove books from arrayList 
			
			// clearing out scan 
			sc.nextLine();

			choice = Console.getChoice("Continue? (y/n): ", "y", "n");
			System.out.println();
		}
		
		for (Book m : shoppingCart) {
			System.out.println(m.toString());
		}
		
		
		
	}
}
