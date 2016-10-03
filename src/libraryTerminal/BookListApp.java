package libraryTerminal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//import java.util.Arrays;
import java.util.Scanner;

public class BookListApp {
	// Declarations
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int min = 0;
		int max = 4;
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
			
			//Re-number the books when removed from Arraylist
			for(int q=0; q<allBooks.size(); q++){
				
				allBooks.get(q).setnewBooknum((q+1)+". "); 
				
			}
			
			// Display full Booklist
			
			System.out.println("There are " + allBooks.size() + " books currently on the library list.\n");
			for (Book m : allBooks) {
				System.out.println(m.toString());
			}
			
			// blank line
			System.out.println();
			
			// Nothing under 1 or over 3 allowed by getInt method
			int search =Console.getInt("Press (1) if you are searching by category, (2) if by author, or (3) if by title, please", min, max);
			
			if(search==1){
			
			String category = Console.getRequiredString("What category are you interested in? (Adventure, Romance or Horror?)");
			
			System.out.println();
			
			// to access Movie DB class to get categories
			ArrayList<Book> bookCat = BookDB.getBook(category);
			
			for (Book m : bookCat) {
				System.out.println(m.getnewbooknum() + m.getTitle()+" by: " + m.getAuthor());
				
			}
			System.out.println();
			
			}if(search==2){
				//System.out.println("Enter an author's name.");
				//String authorChoice=sc.nextLine();
				ArrayList<Book> allAuthors = BookDB.getAuthor(choice);

				for (Book m : allAuthors)  {
					System.out.println(m.toString1());
				}
				
				//{
				//	System.out.println(m.getnewbooknum() + m.getTitle());
					//System.out.println(m.getnewbooknum() + m.getAuthor());
				//}
			}else
				
				
			
			
			// add println to enter a book number 1-12
			System.out.println("Which book would you like to borrow? (enter a number between 1 - 12)");
			int bookInput = sc.nextInt();// scan for number associated with book
			bookInput--;
			shoppingCart.add(allBooks.get(bookInput));	//add to shoppingCart
			allBooks.remove(bookInput);     //remove books from arrayList 
			
			// clearing out scan 
			sc.nextLine();
			
			// continue statement input validation block
			choice = Console.getChoice("Continue? (y/n): ", "y", "n");
			System.out.println();
		}
		
		Date currentDate = new Date ();
		System.out.println("CURRENT DATE:" + currentDate);
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.add(Calendar.DATE, 14);
		System.out.println("DUE DATE:" +(calendar.getTime()));
		
		
		
		for (Book m : shoppingCart) {
			System.out.println(m.toString());
		}
		
		
		
	}
}
