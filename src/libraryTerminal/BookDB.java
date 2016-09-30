package libraryTerminal;

import java.util.ArrayList;

public class BookDB {

	public static ArrayList<Book> allBooks = new ArrayList<>(100);

	public static ArrayList<Book> getallBooks() {

		allBooks.add(new Book("1. ", "Divergent", "Veronica Roth", "Adventure"));
		allBooks.add(new Book("2. ", "The Infinity Sea", "Rick Yancey", "Adventure"));
		allBooks.add(new Book("3. ", "Into the Wild", "Jon Krakauer", "Adventure"));
		allBooks.add(new Book("4. ", "Island of the Blue Dolphins", "Scott ODell", "Adventure"));
		allBooks.add(new Book("5. ", "Four Years Later", "Monica Murphy", "Romance"));
		allBooks.add(new Book("6. ", "Claimed", "Stacey Kennedy", "Romance"));
		allBooks.add(new Book("7. ", "Four Things a Woman want from a man", "A.R Bernard", "Romance"));
		allBooks.add(new Book("8. ", "To Catch a Lady; A Hunt Club Novel", "Pamela Labud", "Romance"));
		allBooks.add(new Book("9. ", "Asylum:Volume 1", "Madeleine Roux", "Horror"));
		allBooks.add(new Book("10. ", "Feed", "Mira Grant", "Horror"));
		allBooks.add(new Book("11. ", "The Long Walk Home", "Stephen King", "Horror"));
		allBooks.add(new Book("12. ", "A New Darkness", "Joseph Delaney", "Horror"));
		// allBooks.add(new Book("The Troop", "Nick Cutter"));

		return allBooks;
	}

	public static ArrayList<Book> getBook(String category) {
		ArrayList<Book> book = new ArrayList<>();
		for (Book m : allBooks) {
			if (m.getCategory().equalsIgnoreCase(category)) {
				book.add(m);
			}
		}
		return book;
	}
}
